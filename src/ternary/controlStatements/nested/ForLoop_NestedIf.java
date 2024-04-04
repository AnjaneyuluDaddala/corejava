package ternary.controlStatements.nested;

public class ForLoop_NestedIf {

	public static void main(String[] args) {
		boolean found=true;
		for(int i=10;i>0;i--) {
			System.out.println(i);
		}
		
		System.out.println();
		for(int i=0;i<11;i++) {
			System.out.println(i);
			if(i==2) {
				System.out.println("I found 2 sir " +i);
			}
		}
		
		System.out.println();
		for(int i=0;i<11;i++) {
			if(i==5) {
				if(found==true)
				System.out.println("I found 5 nested if sir " +i);
			}
		}
		

	}

}
