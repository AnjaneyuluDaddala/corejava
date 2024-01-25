package interestingPrograms;


import java.util.Scanner;

public class TriangularPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any numder-");
		int r=sc.nextInt();
		System.out.println();
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("@");
			}
			System.out.println();
		}

	}

	

}
