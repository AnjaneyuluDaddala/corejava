package interestingPrograms;

import java.util.Scanner;

public class PyramidPattern {

	public static void main(String[] args) {
		
		   
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the number of rows for the pyramid: ");
		        int rows = scanner.nextInt();
		        
		        for (int i = 1; i <= rows; i++) {
		            // Print spaces in decreasing order
		            for (int j = rows; j > i; j--) {
		                System.out.print(" ");
		            }
		            
		            // Print '*' in increasing order
		            for (int k = 1; k <= i; k++) {
		                System.out.print("* ");
		            }
		            
		            // Move to the next line
		            System.out.println();
		        }
		        scanner.close();
		    }


	}


