
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class calculator_implementation extends UnicastRemoteObject implements calculator {

    public calculator_implementation() throws RemoteException {
        super();
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) throws RemoteException {
        return a - b;
    }
}
