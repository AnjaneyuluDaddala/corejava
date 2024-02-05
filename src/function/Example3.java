package function;

import java.util.function.Function;

public class Example3 {

	public static void main(String[] args) {
		 
	        // Function which takes in a number and
	        // returns it
	        Function<Double, Double> i = Function.identity();
	 
	        // Print statement
	        System.out.println(i.apply(10.9));

	}

}

