package streams4pmBatch;

import java.util.stream.Stream;

public class ArrayUsingStream {

	public static void main(String[] args) {
//		int[]  StudentAge= {21,23,24,22,22,23,36};
//		
//		Stream<int[]> of = Stream.of(StudentAge);
		
		
		
		
       Integer[]  StudentAge= {21,23,24,22,22,23,36};
		
		Stream<Integer> Age = Stream.of(StudentAge);
		
		  Age.filter(a->a>21).filter(n->n%2==0)
		  .forEach(a->System.out.println("They are age gerter than 21 and They are even "+a));
		  
		
		
		
//		Age.filter(a->a>21).forEach(System.out::println);

	}

}
