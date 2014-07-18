package client.View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Cell;

/**
 *
 * @author dangth
 */
public class ClientChooseNumberView extends JFrame {

    private JPanel contentPane;
    private JButton[] button = new JButton[9];
    private JLabel txtNumber;
    private Cell cell;

    public ClientChooseNumberView(Cell cell) {
        super("Choose Number Cell " + cell.getX() + ":" + cell.getY());
        this.cell = cell;
        txtNumber = new JLabel("Number" + cell.getX() + ":" + cell.getY());
        txtNumber.setBounds(10, 10, 100, 14);
        
        setBounds(600, 350, 150, 200);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.add(txtNumber);
        
        JPanel contentPane2 = new JPanel();
        contentPane2.setLayout(new GridLayout(3, 3));
        contentPane2.setBounds(10, 30, 3 * 40, 3 * 40);
        contentPane.add(contentPane2);
        for (int i = 0; i < 9; i++) {
            button[i] = new JButton("" + (i+1));
            button[i].setMargin(new Insets(1, 1, 1, 1));
            button[i].setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
            button[i].setForeground(Color.RED);
            contentPane2.add(button[i]);
        }
        this.setPreferredSize(new Dimension(100,100));
        this.setLocationRelativeTo(this);
    }
    
    public void showMessage(String str) {
        JOptionPane.showMessageDialog(this, str);
    }
    
    public Cell getCell() {
        return cell;
    }
    
    public void addButtonActionListener (ActionListener ac) {
        for (int i = 0; i < 9; i++) {
            button[i].addActionListener(ac);
        }
    }
    public static void main(String[] args) {
        new  LookAndFeel();
        new ClientChooseNumberView(new Cell(2, 2)).setVisible(true);
    }
}
