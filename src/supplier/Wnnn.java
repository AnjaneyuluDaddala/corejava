package supplier;

import java.util.function.Supplier;

public class Wnnn {
	
	static double getPI() {
		
		
		Supplier<Double> ref=()->{
			return Math.PI;
		};
		return ref.get();
	}
	
	
static String upperCaase(String str) {
	
	Supplier<String>ref1=()->{return str.toUpperCase();};
	
	return ref1.get();
	
}



}
