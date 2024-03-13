package lambdaExpressions;

public class ExtendNormal implements NormalInterface {

	@Override
	public void m1(int a, int b) {
	
	System.out.println("Area of Rectangle = "+ a*b);
		
	}

	@Override
	public void m1(double b) {
		System.out.println("Area of Square = "+ (b*b));
		
	}

}
