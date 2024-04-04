package ternary.controlStatements.nested;

public class NestedForLoop {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {      // this is like row
			for(int k=0;k<10;k++) {
				System.out.print(k +" ");  // this is like column
			}
			System.out.println();
		}
		
		
		// triangle shape
		System.out.println();
		for(int i=0;i<10;i++) {      // this is like row
			for(int k=i;k<10;k++) {
				System.out.print("*" +" ");  // this is like column
			}
			System.out.println();
		}

		// triangle shape
				System.out.println();
				for(int i=10;i>=0;i--) {      // this is like row
					for(int k=i;k>=0;k--) {
						System.out.print("*" +" ");  // this is like column
					}
					System.out.println();
				}
				
				
				
				//payramid
	}

}
