package serverRMI;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import model.Cell;
import model.Board;

/**
 *
 * @author dangth
 */
public class ServerRMIControl extends UnicastRemoteObject implements RMISudokuInterface {
    
    private ServerRMIView view;
    private Registry registry;
    private int port = 1234;
    
    public ServerRMIControl(ServerRMIView view) throws RemoteException {
        this.view = view;
        try {
            registry = LocateRegistry.createRegistry(port);
            registry.rebind("RMISudoku", this);
            view.showMessage("RMI server is running ...");
        } catch (Exception ex) {
            view.showMessage(ex.toString());
        }
        
    }
    
    @Override
    public boolean checkSudoku(Board matrix) throws RemoteException {
        Cell[][] tmpArrNote = matrix.getNoteMap();
        Cell tmpNote = matrix.getNote();
        
        for (int i = 0; i < 9; i++) {
            if (tmpArrNote[tmpNote.getToaDoX()][i].getValue() == matrix.getValue()) {
                return false;
            }
            if (tmpArrNote[i][tmpNote.getToaDoY()].getValue() == matrix.getValue()) {
                return false;
            }
        }
        
        return isPossibleBlock(matrix);
    }
    
    private boolean isPossibleBlock(Board matrix) {
        Cell[][] tmpArrNote = matrix.getNoteMap();
        Cell tmpNote = matrix.getNote();
        
        int x1 = tmpNote.getToaDoX() < 3 ? 0 : tmpNote.getToaDoX() < 6 ? 3 : 6;
        int y1 = tmpNote.getToaDoY() < 3 ? 0 : tmpNote.getToaDoY() < 6 ? 3 : 6;
        for (int xx = x1; xx < x1 + 3; xx++) {
            for (int yy = y1; yy < y1 + 3; yy++) {
                if (tmpArrNote[xx][yy].getValue() == matrix.getValue())
                    return false;
            }
        }
        return true;
    }
    
    @Override
    public boolean checkWin(Board matrix) throws RemoteException {
        Cell[][] tmpArrNote = matrix.getNoteMap();
        Cell tmpNote = matrix.getNote();
        tmpArrNote[tmpNote.getToaDoX()][tmpNote.getToaDoY()].setValue(matrix.getValue());
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (tmpArrNote[i][j].getText().isEmpty() || tmpArrNote[i][j].getValue() < 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
