package interestingPrograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number here = ");
		int n=sc.nextInt();
		int temp,r;
		temp=n;
		int sum=0;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		System.out.println("reversing the given number is "+sum);
		if(temp==sum) {
			System.out.println("Yes,it is palindrone-->");
		}else {
			System.out.println("sorry,it is not palindrone-->");
		}
		
	}
	}
