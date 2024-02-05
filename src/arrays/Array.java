package arrays;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*
		String[] color=new String[4];
		
		
		System.out.println("Enter your favarote colors :");
		color[0]=sc.next();
		color[1]=sc.next();
		color[2]=sc.next();
		color[3]=sc.next();
		
		System.out.println(color[0]);
		System.out.println(color[1]);
		System.out.println(color[2]);
		System.out.println(color[3]);
		
		
		*/
		
		System.out.println("How many numbers will you enter- ");
		  int n=sc.nextInt();
		  
		 System.out.println("The numbers you enter is " + n + " numbers");
		 int[] arr=new int[n];
		
		 for(int i=0;i<arr.length;i++) {
			 System.out.print("The arr["+i+"] = ");
			 arr[i]=sc.nextInt();
		 }
		 System.out.println();
		 for(int i=0;i<arr.length;i++) {
			System.out.println( arr[i]);
		 }
		 	
		
		/*
		
		int[] a= new int[8];
		
		System.out.println("Enter the element of array = ");
		for(int i=0;i<=a.length;i++) {
			a[i]=sc.nextInt();
		
		}
		*/

	}

}
