package streams4pmBatch;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamTry1 {

	public static void main(String[] args) {
		//Streams are manuplation of data.
		//n%2!=0;
		//stream is normal interface...
		Stream<Integer> stream=Stream.of(1,23,4,56,78,9,0);
		
		Predicate<Integer>p=a->a>9;
		
		stream.filter(p).forEach(System.out::println);

	}

}
