package client;

import client.View.SudokuView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Random;
import javax.swing.JButton;
import model.Game;
import model.Cell;
import model.Board;

/**
 * 
 * @author dangth
 */
public class ClientControl {

	private SudokuView view;
	private ClientChooseNumberView viewChooseNumber = null;
	//
	private String serverHost = "localhost";
	private int serverPort = 4321;
	private Socket socket;
	//
	private final int ROWS = 9;
	private final int COLS = 9;
	private Cell[][] startMap;
	private int[][] valueMap;
	private Game game;

	public ClientControl(SudokuView view) {
		game = new Game();
		valueMap = game.generateSolution(new int[ROWS][COLS], 0);
		this.view = view;
		view.setVisible(true);
		view.addCellActionListener(new CellActionListener());
		startMap = new Cell[ROWS][COLS];
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLS; j++) {
				startMap[i][j] = new Cell(i, j);
				int rd = new Random().nextInt(4);
				if (rd < 2) {
					startMap[i][j].setValue(valueMap[i][j]);
				} else {
					startMap[i][j].resetCell();
				}
			}
		}
		view.resetPanelCenter(startMap);

		try {
			socket = new Socket(serverHost, serverPort);
		} catch (Exception ex) {
			ex.printStackTrace();
			view.showMessage(ex.toString());
		}

	}

	public int checkChooseNumber(Board matrix) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(
					socket.getOutputStream());
			ObjectInputStream ois = new ObjectInputStream(
					socket.getInputStream());

			oos.writeObject(matrix);
			Object obj = ois.readObject();

			if (obj instanceof String) {
				String str = (String) obj;
				if (str.equalsIgnoreCase("true")) {
					return 1;
				}
				if (str.equalsIgnoreCase("win")) {
					return 2;
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			view.showMessage(ex.toString());
		}

		return 0;
	}

	class CellActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Cell n = (Cell) e.getSource();
			viewChooseNumber = new ClientChooseNumberView(n);
			viewChooseNumber.setVisible(true);
			viewChooseNumber
					.addButtonActionListener(new ChooseNumberActionListener());
		}
	}

	class ResetActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			view.resetPanelCenter(startMap);
			if (viewChooseNumber != null) {
				viewChooseNumber.setVisible(false);
			}
		}
	}

	class ChooseNumberActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource();
			Cell[][] tmpArrCell = view.getArrayCell();
			Cell tmpCell = viewChooseNumber.getCell();
			int tmpValue = Integer.parseInt(b.getText());

			Board matrix = new Board(tmpCell, tmpArrCell, tmpValue);
			viewChooseNumber.setVisible(false);

			int check = checkChooseNumber(matrix);
			switch (check) {
			case 0:
				view.showMessage("Sai quy tac !");
				view.formatcell(tmpArrCell);
				return;
			case 1:
				tmpArrCell[tmpCell.getToaDoX()][tmpCell.getToaDoY()]
						.setValue(tmpValue);
				new SudokuView();
				view.resetPanelCenter(tmpArrCell);
				view.formatcell(tmpArrCell);
				return;
			case 2:
				tmpArrCell[tmpCell.getToaDoX()][tmpCell.getToaDoY()]
						.setValue(tmpValue);
				new SudokuView();
				view.resetPanelCenter(tmpArrCell);
				view.formatcell(tmpArrCell);
				view.showMessage("Win");
				return;
			}
		}
	}
}
