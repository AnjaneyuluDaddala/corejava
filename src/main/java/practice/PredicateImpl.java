package practice;

import java.util.function.Predicate;

public class PredicateImpl {
	
	public static void main(String[] args) {
		Predicate<String> ref=x->x.length()>10;

		boolean bol=ref.test("sailaja");
		System.out.println(bol);
	}

}
