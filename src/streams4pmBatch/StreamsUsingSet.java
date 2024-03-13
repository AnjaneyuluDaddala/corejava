package streams4pmBatch;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamsUsingSet {

	public static void main(String[] args) {
		Set<String> names=new HashSet<>();
		names.add("Sunil");
		names.add("SonamKapoor");
		names.add("Ajay");
		names.add("Arjun");
		names.add("Rajesh");
		names.add("Kumar");
		
		
		Stream<String> Snames = names.stream().filter(a->a.startsWith("S"));
		Snames.forEach(a->System.out.println(a));
		

	}

}
