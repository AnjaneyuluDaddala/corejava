package exceptionHandling;

import java.util.Scanner;

public class Exception1 {
	void value() {
		
		System.out.println("line1------------------->invoked "+100/3);
		System.out.println("line2------------------->invoked "+200/2);
		
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the denominator--");
			int denom=sc.nextInt();
			if(denom>0) {
				// what will happen given 0.1 and 0.8
				System.out.println("line4------------------->invoked "+400/denom);
			}
			else {
				System.out.println("Zero is not taken as input----->"+denom);
			}
			
			
			
		}catch(Exception e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("line3------------------->invoked "+300/9);
		System.out.println("line5------------------->invoked "+500/2);
		System.out.println("line6------------------->invoked "+600/9);
		
	}

	public static void main(String[] args) {
		Exception1 ex=new Exception1();
		ex.value();
		System.out.println("line7------------------->invoked ");
		

	}

}
