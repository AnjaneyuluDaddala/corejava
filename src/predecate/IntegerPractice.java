package predecate;

import java.util.function.Predicate;

public class IntegerPractice {

	public static void main(String[] args) {
		Predicate<Integer> ref=str->Integer.sum(9, 10)<200;
		System.out.println(ref.test(1));

	}

}
