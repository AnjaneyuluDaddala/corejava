package streams;

import java.util.stream.Stream;

public class StreamWithConsumer {

	public static void main(String[] args) {
		Stream<Integer>stream=Stream.of(1,2,3,4,5,67,8,2);
		stream.forEach(x->System.out.println(x));
		System.out.println();
		
		Stream<Integer>stream1=Stream.of(1,2,3,4,5,67,8,2);
		int i=(int)stream1.filter(x->x>5).count();
		System.out.println(i);

	}

}
