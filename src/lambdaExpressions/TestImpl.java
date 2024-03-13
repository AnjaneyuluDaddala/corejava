package lambdaExpressions;

public class TestImpl {

	public static void main(String[] args) {
		PracticeInter ref=(a,b)->{
			 	System.out.println("1st statement----> "+a+b);
				System.out.println("2nd statement----> "+ (a/b));
		};
				ref.m1(12,12);
				
				
			System.out.println()	;
				
				PracticeInter ref1=(a,b)->
				 	System.out.println("1st statement----> "+a*b);
					System.out.println("2nd statement----> ");
			
					ref1.m1(23,23);
					
					NormalInterface normal =new ExtendNormal(); 
					normal.m1(12);
	}
	
	
	
	 
	 
		


}
