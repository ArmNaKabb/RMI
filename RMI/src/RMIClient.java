import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RMIClient {
	public static void main(String[] args) throws MalformedURLException, 
		RemoteException, NotBoundException {
		RMIInterface obj = (RMIInterface)Naming.lookup("RMIServer");
		try{
			String msg = (obj).list('\n'+"1 : ��� 20�ҷ"+'\n'+"2 : �ҹ� 25 �ҷ"
					+'\n'+"3 : ����� 25 �ҷ"+'\n'+"4 : ���ѹ�Թ 30 �ҷ"+'\n'+"�ҡ�����Թ 100 �ҷ���� �Ѻ��ǹŴ 20%");
			System.out.println(msg);
			
			
		}catch(Exception e){
			System.out.println(e);
		}

	}

}
			
		

	


