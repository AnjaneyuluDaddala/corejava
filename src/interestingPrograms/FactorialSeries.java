package interestingPrograms;

import java.util.Scanner;

public class FactorialSeries {
	
	public static int  factorial(int num) {
		if(num<=0 || num==1) {
			return 1;
		}else {
			return num*factorial(num-1);
		}
		
		
	}
	
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number for finding factorial=");
		int n= sc.nextInt();
		int find=factorial(n);
		System.out.println("The factorial of given number is ="+find);
		
	}

}
