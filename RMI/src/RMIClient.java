import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RMIClient {
	public static void main(String[] args) throws MalformedURLException, 
		RemoteException, NotBoundException {
		RMIInterface obj = (RMIInterface)Naming.lookup("RMIServer");
		try{
			String msg = (obj).list('\n'+"1 : กาแฟ 20บาท"+'\n'+"2 : ชานม 25 บาท"
					+'\n'+"3 : นมเย็น 25 บาท"+'\n'+"4 : โอวันติน 30 บาท"+'\n'+"หากซื้อเกิน 100 บาทขึ้นไป รับส่วนลด 20%");
			System.out.println(msg);
			
			
		}catch(Exception e){
			System.out.println(e);
		}

	}

}
			
		

	


