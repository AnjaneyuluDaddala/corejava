package streams4pmBatch;

import java.util.Random;
import java.util.stream.Stream;

public class GenerateRandomOtp {

	public static void main(String[] args) {
		Stream<Integer> randomNumbers=Stream.generate(()->(new Random()).nextInt(10000));
		randomNumbers.limit(3).forEach(System.out::println);

	}

}
