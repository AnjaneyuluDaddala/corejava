package predecate;

import java.util.function.Predicate;

public class StringPractice {

	public static void main(String[] args) {
		Predicate<String>rdf=str->str.length()>5;
		boolean s=rdf.test("lasd");
		System.out.println("Is length is greater than 5 : "+s);
		

	}

}
