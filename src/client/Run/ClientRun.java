package client.Run;

import client.ClientControl;
import client.View.LookAndFeel;
import client.View.SudokuView;
import model.Cell;

/**
 *
 * @author dangth
 */
public class ClientRun {
    
    public static void main(String[] args) {
        new LookAndFeel();
        SudokuView view = new SudokuView();
        //ClientView view = new ClientView();
        ClientControl control = new ClientControl(view);      
    }
}
