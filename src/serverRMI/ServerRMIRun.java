package serverRMI;

import java.rmi.RemoteException;

/**
 *
 * @author dangth
 */
public class ServerRMIRun {

    public static void main(String[] args) throws RemoteException {
        ServerRMIView view = new ServerRMIView();
        ServerRMIControl control = new ServerRMIControl(view);
    }
}
