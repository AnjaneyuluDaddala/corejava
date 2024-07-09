package assingnments;

public interface Calculator {
	
	static int add(int a,int b) {
		
		return a+b;
	}
	static int sub(int a,int b) {
		
		return a-b;
	}
	static int multiply(int a,int b) {
		
		return a*b;
	}
	static int division(int a,int b) {
		
		return a/b;
	}
	static double squareRoot(double a) {
		
		return Math.sqrt(a);
	}
	static double tan(double a) {
		
		return Math.tan(a);
	}
	static double sin(double a) {
		
		return Math.sin(a);
	}
	static double cos(double a) {
		
		return Math.cos(a);
	}

	}



