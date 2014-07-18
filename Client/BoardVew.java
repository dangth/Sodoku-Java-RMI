import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.UIManager;


public class BoardVew extends JFrame{
	public BoardVew(){
		super("Sudoku");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());
		
		SudokuPanel board = new SudokuPanel();
		add(board);
		pack();
		setLocationRelativeTo(null);
		setSize(new Dimension(500, 500));
	}
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception ex) {
			// TODO: handle exception
			ex.printStackTrace();
		}
		BoardVew b = new BoardVew();
		b.setVisible(true);
	}
	
}
