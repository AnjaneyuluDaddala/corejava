package corejava;

import java.util.Scanner;

public class DoWhileDemo {

	  public static void main(String[] args) {
	    int option=0;
	    String continueYN = "N";
	    
	    do {
	    
	      System.out.println("Please select the option from the list");
	      System.out.println("1. Net Banking Services.");
	      System.out.println("2. UPI Money Transfer Services.");
	      System.out.println("3. Credit Card Payments Services.");
	      System.out.println("4. To Speak to our caller.");
	    
	        Scanner scan = new Scanner(System.in);
	        option = scan.nextInt();
	        
	        switch(option) {
	           
	        case 1:
	          System.out.println("Thank you for choosing this option please enter your netbanking details");
	          break;
	          
	        case 2:
	          System.out.println("Thank you for choosing this option please enter your UPI details");
	          break;
	          
	        case 3:
	          System.out.println("Thank you for choosing this option please enter your Credit Card details");
	          break;
	          
	        case 4:
	          System.out.println("Thank you for choosing this option please be online our telecaller will talk to you shortly");
	          break;
	          
	        default:
	            System.out.println("Invalid options please select your options between (0 to 5)");
	        }
	        
	        System.out.println("Do you wish to continue?");
	        continueYN = scan.next();
	        
	    }while(continueYN.equalsIgnoreCase("Y"));
	    
	    System.out.println("Thank you for banking with us. Have a great day...");
	    
	  }

	}
