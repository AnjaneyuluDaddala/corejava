
package interfaceCore;

import java.util.Scanner;

public class NissanCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any option given below :");
		System.out.println("1.Geting the order from MRF TYRES..");
		System.out.println("2.Geting the order from CERT TYRES..");
		int option =sc.nextInt();
		// Tyres t=null;
				
		if(option == 1) {
			
			Tyres t=new MRF();
			int tyres= t.placeOrder(3000);
			t.diameterTyres(2.14);
			System.out.println("The total cost of tyres in MRF ,You ordered is = " + t.CostOfTyres(200, tyres));
			//System.out.println("Each of tyre cost is = ");
		}else if(option == 2) {
			Tyres t=new CERT();
			int tyres= t.placeOrder(7000);
			t.diameterTyres(4.13);
			System.out.println("The total cost of tyres in CERT, You ordered is = "+t.CostOfTyres(300,tyres));
		}else {
			System.out.println("Gives the error-----------");
		}
		

	}

}
