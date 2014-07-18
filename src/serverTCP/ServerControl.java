package serverTCP;

import serverRMI.RMISudokuInterface;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import model.Board;

/**
 *
 * @author dangth
 */
public class ServerControl {

    private ServerView view;
    // RMI
    private Registry registry;
    private RMISudokuInterface rmiServer;
    private String rmiService = "RMISudoku";
    private String rmiHost = "localhost";
    private int rmiPort = 1234;
    // Server
    private ServerSocket server;
    private int port = 4321;
    //

    public ServerControl(ServerView view) {
        this.view = view;
        try {
            registry = LocateRegistry.getRegistry(rmiHost, rmiPort);
            rmiServer = (RMISudokuInterface) registry.lookup(rmiService);

            server = new ServerSocket(port);
            view.showMessage("Server TCP is running ...");

            Thread th = new Thread() {
                public void run() {
                    while (true) {
                        listening();
                    }
                }
            };
            
            th.start();
        } catch (Exception ex) {
            ex.printStackTrace();
            view.showMessage(ex.toString());
        }

    }

    public void listening() {
        try {
            Socket sk = server.accept();
            ThreadPlayer threadPlayer = new ThreadPlayer(sk);
            threadPlayer.start();
        } catch (Exception ex) {
            ex.printStackTrace();
            view.showMessage(ex.toString());
        }
    }

    class ThreadPlayer extends Thread {

        private Socket socketThread;
        private boolean isRunning = true;

        public ThreadPlayer(Socket socketThread) {
            this.socketThread = socketThread;
        }

        @Override
        public void run() {
            while (isRunning) {
                listeningPlayer();
            }
        }

        public void listeningPlayer() {
            try {
                ObjectOutputStream oos = new ObjectOutputStream(socketThread.getOutputStream());
                ObjectInputStream ois = new ObjectInputStream(socketThread.getInputStream());

                Object obj = ois.readObject();

                if (obj instanceof Board) {
                    Board matrix = (Board) obj;
                    if (rmiServer.checkSudoku(matrix)) {
                        if (rmiServer.checkWin(matrix)) {
                            oos.writeObject("win");
                            return;
                        }
                        oos.writeObject("true");
                        return;
                    }
                    oos.writeObject("false");
                    return;
                }
                oos.writeObject("not OK");
            } catch (Exception ex) {
                isRunning = false;
                view.showMessage(ex.toString());
            }
        }
    }
}
