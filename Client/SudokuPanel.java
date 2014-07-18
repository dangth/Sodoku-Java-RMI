import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.management.StringValueExp;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class SudokuPanel extends JPanel{
	
	private JButton[][] cell;
	private JPanel[][] panel;
	private JPanel content;
	private JDialog box;
	public SudokuPanel(){
		super(new GridLayout(3, 3));
		cell = new JButton[9][9];
		panel = new JPanel[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				panel[i][j] = new JPanel(new GridLayout(3, 3));
				panel[i][j].setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
				add(panel[i][j]);
			}
		}
		content = new JPanel(new GridLayout(3,3));
		box = new JDialog();
		box.setSize(new Dimension(100,100));
		for (int i = 1; i <= 9; i++) {
			JButton b = new JButton();
			b.setText(String.valueOf(i));
			b.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					box.dispose();
				}
			});
			content.add(b);
		}
		box.add(content);
		box.setVisible(false);
		box.setLocationRelativeTo(null);
		
		
		int num = 1;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				cell[i][j]= new JButton();
				cell[i][j].setText((String.valueOf(j+1)));
				panel[i/3][j/3].add(cell[i][j]);
				cell[i][j].addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						box.setVisible(true);
					}
				});;;
			}
		}
	}
	
}
