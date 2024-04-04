package ternary.controlStatements.nested;

import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
		
		/*
		 * Initialization
		 * condition
		 * updation
		 */
		int i=0;
		while(i<10) {
			System.out.println("hello");
			System.out.println(i);
			System.out.println("iteraton = "+i);
			i++;
		}
		
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Guess the password--");
    String guess=sc.next();
    String password="anji@123";
    while(!guess.equals(password)) {
    	System.out.println("guess the password--");
    	guess=sc.nextLine();
    }
    System.out.println("contrats");
    sc.close();
    
    
	}

}
