package assingnments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NetBanking implements Payment{

	public static void main(String[] args) {
		new NetBanking().paymentPrice(5000);

	}

	@Override
	
	public void paymentPrice( double price) {
		Scanner sc=new Scanner(System.in);
		List<String>al=new ArrayList<String>();
		al.add(0,"1.Allahabad Bank");
		al.add(1,"2.Andhra Bank");
		al.add(2,"3.Axis Bank");
		
		al.add(3,"4.Bank of Baroda Kuwait	");
		al.add(4,"5.Bank of Bahrain ");
		al.add(5, "6.Bank of India");
		
		al.add(6,"7.HDFC Bank");
		al.add(7,"8.ICICI Bank");
		al.add(8,"9.Canara Bank");
		
		al.add(9,"10.State Bank of India");
		al.add(10,"11.Karur Vysya Bank");
		
		
		
		System.out.println("Please select any option here below --");
		for(String s:al) {
			System.out.println(s);
			
			//int option =sc.nextInt();
			//System.out.println(s);
		}
	
		
	}

}
