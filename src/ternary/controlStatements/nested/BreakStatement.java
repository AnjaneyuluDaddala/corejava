package ternary.controlStatements.nested;

public class BreakStatement {

	public static void main(String[] args) {
		for(int i=10;i>=0;i--) {
			for(int j=i;j>=0;j--) {
				if(j==7) {
					break;
				}System.out.print(j+" ");
				
			}
			if(i==4) {
				break;
			}
			System.out.println();
		}

	}

}
