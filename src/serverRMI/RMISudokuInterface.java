package serverRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;
import model.Board;

/**
 *
 * @author dangth
 */
public interface RMISudokuInterface extends Remote {
    
    public boolean checkSudoku(Board matrix) throws RemoteException;
    
    public boolean checkWin(Board matrix) throws RemoteException;
    
}
