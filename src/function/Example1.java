package function;

import java.util.function.Function;

public class Example1 {

	public static void main(String[] args) {
		Function<Integer,Double>ref=a->a/10.0;
		ref=ref.andThen(a->a*23.7);
		
		System.out.println(ref.apply(20));
		
		
		
		// Function which takes in a number and
        // returns half of it
        Function<Integer, Double> half = a -> a / 2.0;
 
        // Try block to check for exceptions
        try {
 
            // Trying to pass null as parameter
            half = half.andThen(null);
        }
 
        // Catch block to handle exceptions
        catch (Exception e) {
 
            // Print statement
            System.out.println("Exception thrown "
                               + "while passing null: "
                               + e);
		
		

	}

}
}
