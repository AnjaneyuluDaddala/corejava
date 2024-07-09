package exceptionHandling;

import java.util.Scanner;

public class ResolveExcetionCatch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numerator and denominator -->");
		int numer=sc.nextInt();		
		int denom=sc.nextInt();
		try {
			System.out.println("a------------> "+numer/denom);
		}catch(Exception e) {
			System.out.println("The value is "+numer/(denom+1));
		}
		

	}

}
