import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by eder on 30/11/15.
 */
public interface MyRemote  extends Remote{
     String sayHello() throws RemoteException;
}
