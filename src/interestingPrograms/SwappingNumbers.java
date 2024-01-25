package interestingPrograms;

import java.util.Scanner;

public class SwappingNumbers {

	public static void main(String[] args) {
		int x ,y,t;
		

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of x and y = ");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("The numbers before swapping is = " + x +" and "+y);
		t=x;
		x=y;
		y=t;
		
		/*
		 * with out using third variable
		 * x=x+y;
		 * y=x-y;
		 * x=x-y; 
		 */
		System.out.println("The numbers after swapping is = " + x +" and "+y);
		
	
	}

}
