package ternary.controlStatements.nested;

public class ContinueStatement {

	public static void main(String[] args) {
		
		for(int i=9;i>=0;i--) {
			for(int j=i;j>=0;j--) {
				if(j==4) {
					continue;
					}
				System.out.print(j+" ");
			}
			System.out.println();
		}
		

	}

}
