package saturdayArrays;

public class TwoDimensionalArray1 {

	public static void main(String[] args) {
		// Java Program to demonstrate
		// Java Multidimensional Array
	
				// Syntax
				int[][] arr = new int[3][3];
				// 3 row and 3 column

				// Number of Rows
				System.out.println("Number of Rows:"+
								arr.length);
			
				// Number of Columns
				System.out.println("Number of Columns:"+
								arr[0].length);
				
				  System.out.println();
				
				  // declaring and initializing 2D array
		        int arr1[][]
		            = { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } };
		 
		        // printing 2D array
		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++)
		                System.out.print(arr1[i][j] + " ");
		 
		        }
	
			}
		}

	
