package assingnments;

public class Interview1 {
	
	private static double integer(int a,int b) {
		
		double c=Math.pow(a, b);
		return c;
	}

	public static void main(String[] args) {
		
		double x=integer(2,3);
		
		Double b=Double.valueOf(x);
		
		System.out.println(b.intValue());

	}

}
