package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayClassUtility {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array= ");
		 int n=sc.nextInt();
		 int m=sc.nextInt();
		 int a[]=new int[n];
		 int a1[]=new int[m];
		 System.out.println("The first size of Array is = "+n);
		 System.out.println("The second size of Array is = "+m);
		 
		 for(int i=0;i<a.length;i++) {
			 System.out.print("a["+i+"]= ");
			 a[i]=sc.nextInt();
		 }
		 for(int i=0;i<a1.length;i++) {
			 System.out.print("a1["+i+"]= ");
			 a1[i]=sc.nextInt();
		 }
		 
		 
		 /*
		 Arrays.sort(a);
		 for(int i=0;i<a.length;i++) {
			 System.out.println(a[i]+" ");
			 
		 }
		 */
		 boolean b=Arrays.equals(a, a1);
		 System.out.println("The first array and second array is equal is true  or not equal false  " +" hai it is "+ b);

	}

}
