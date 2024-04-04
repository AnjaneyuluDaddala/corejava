package assingnments;

import java.util.Scanner;

public class OtherUPI implements Payment{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void paymentPrice( double price) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Thank you for choosing otherUPI");
		System.out.println("Please enter UPI id = ");
		String s=sc.next();
		System.out.println("The  price is = "+price);
		System.out.println("Please check once all details above ...>");
		System.out.println("It is verified...");
		
		
	}

}
