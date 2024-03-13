package streams4pmBatch;

import java.util.*;
import java.util.stream.Stream;

public class StreamUsingEven {

	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		
		for(int i=0;i<=26;i++) {
			list.add(i);
		}
		
		System.out.println("Size of an Array = "+list.size());
		
		
		Stream<Integer> streamList = list.stream();
		
//		System.out.println("count of Stream ="+streamList.count());
		
		//streamList.filter(a->a%2==0).forEach(System.out::println);
		streamList.map(a->a*10).forEach(System.out::println);
		
		
	}
}
