import java.rmi.Remote;
import java.rmi.RemoteException;



	public interface RMIInterface extends Remote {
		public int Calculation(int price,int total,int discount,int choose) throws RemoteException;
		public String list(String msg);
		public String lists(String string)throws RemoteException;
		
		
	}

