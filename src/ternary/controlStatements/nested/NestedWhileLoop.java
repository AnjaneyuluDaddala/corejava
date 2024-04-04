package ternary.controlStatements.nested;

public class NestedWhileLoop {

	public static void main(String[] args) {
		int i=0;
		while(i<11) {
			int k=0;
			while(k<i) {
			
				System.out.print("*"+" ");
				k++;
			}
			i++;
			System.out.println();
		}

	}

}
