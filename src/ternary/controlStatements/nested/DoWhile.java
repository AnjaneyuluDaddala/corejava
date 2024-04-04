package ternary.controlStatements.nested;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		String password="ajay";
	    Scanner sc=new Scanner(System.in);
	    String guess;
	   
		do {
			System.out.println("Please enter the password");
			guess=sc.nextLine();
			
		}while(!guess.equals(password));
		System.out.println("contrats");
		sc.close();

	}

}
