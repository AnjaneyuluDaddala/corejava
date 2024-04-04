package assingnments;

import java.util.Scanner;

public class CashonDelivery implements Payment {

	@Override
	public void paymentPrice( double price) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Thank you for choosing CashonDelivery");
		double charge =10.00;
		//String s=sc.next();
		System.out.println("The  price is = "+price);
		System.out.println("due to cash on dalivery extraCharge is= "+charge);
		System.out.println("The final  price is = "+(price+charge));
		System.out.println("Please check once all details above ...>");
		System.out.println("It is verified...");
		
		
	}

}
