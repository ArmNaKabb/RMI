import java.rmi.RemoteException;
import java.util.Scanner;


public  class RMIInterfacelmpl implements RMIInterface {

	public int Calculation(int price, int total, int discount, int choose,int same)
			throws RemoteException {
		// TODO Auto-generated method stub
		
			try{
				
				
				Scanner input = new Scanner(System.in);
				same = input.nextInt();
				switch(same){
				case 1:
					price = 20;
					break;
				case 2:
					price = 25;
					break;
				case 3:
					price = 25;
					break;
				case 4:
					price = 30;
					break;
				default:
					System.out.println("That is not 1,2,3or4");
				}
				price = price + price;
				if(price > 100){
					discount = price*20/100;
					total = price-discount;
					System.out.println(discount);}
				else{
					total = price;}
				System.out.println("total = " + total);
				}catch(Exception e){
					System.out.println(e.getMessage());
					
			}
		
		return 0;
	}

	public String list(String msg) {
		// TODO Auto-generated method stub
		return null;
	}

	public String lists(String string) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public int Calculation(int price, int total, int discount, int choose)
			throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

}
