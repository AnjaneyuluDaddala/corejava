package assingnments;

import java.util.Scanner;

public class Successful {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String continueYN;
		do {
			System.out.println("welcome to payment mode-------->");
			System.out.println("1.credit And Debit card.");
			System.out.println("2.NetBanking");
			System.out.println("3.OtherUpi");
			System.out.println("4.Cash on Delivery.");
			System.out.println();
			System.out.println("choose any  Payment mode option :-");
			
			int option=sc.nextInt();
			Payment p=null;
			
			switch(option) {
			  case 1:
			     p=new CreditORDebit();
			     p.paymentPrice(60000); 
			    
			    break;
			  case 2:
				  p=new NetBanking();
				  p.paymentPrice(60000);
				  System.out.println("order is placed ");
			    break;
			  case 3:
				  p=new OtherUPI();
				  p.paymentPrice(60000);
				  System.out.println("order is placed ");
				    break ;
			  case 4:
				  p=new CashonDelivery();
				  p.paymentPrice(60000);
				  System.out.println("order is placed ");
				    break;
			  default:
			    System.out.println("Incorrect option ");
			}
			
			System.out.println("Do you wish to continue :Y/N");
			continueYN=sc.next();
			 
			
		}while(continueYN.equalsIgnoreCase("y")) ;
		
		System.out.println("Have a nice day sir ... ");
	}

}
