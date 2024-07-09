package deligationException;

import java.util.Scanner;

public class LicenceApprovel {
	
	public void LicenceCard(Scanner sc) throws InvalidAgeException,NullPointerException{
		
		System.out.print("Enter your age = ");
		
		
	
		int age=sc.nextInt();
		
		if(age>=18) {
			System.out.println("He is elgible for licence approvel");
			System.out.println("License card is in progress--->");
		}else {
			
		    InvalidAgeException ae=new InvalidAgeException("Age must be greater than 18");
		    throw ae;
		}
		
	}

}
