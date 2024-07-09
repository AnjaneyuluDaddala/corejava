package arrays;

import java.util.Scanner;

public class MultiDimensional {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of row  array =");
	int row=sc.nextInt();
	System.out.println("Enter the size of column  array =");
	int col=sc.nextInt();
	System.out.println("The size of row and column array are =" +row +" and "+col);
	int[][] arr=new int[row][col];
	
	
	
	
	for(int i=0;i<row;i++ ) {
		for(int j=0;j<col;j++) {
			System.out.print("The arr["+i+"]"+"["+j+"]= ");
			arr[i][j]=sc.nextInt();
			
			
		}
		
	}

	for(int i=0;i<row;i++ ) {
		for(int j=0;j<col;j++) {
			System.out.println(arr[i][j]+" ");
			
		}
		
		
	}
	
	

}
}
