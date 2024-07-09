package streams;

import java.util.stream.Stream;

public class Class1StreamCount {

	public static void main(String[] args) {
		Stream<Integer> stream=Stream.of(1,2,3,4,5);
		 System.out.println(stream.count());
		 stream.close();
		 try {
			Stream<Integer> stream1=Stream.of(1,2,3,4,5);
			 long i= stream1.count();
			 stream1.close();
			 System.out.println(i);
		 }catch(Exception e) {
			 e.printStackTrace();
		 }finally{
				Stream<Integer> stream3=Stream.of(1,2,3,4,5);
			 int i1= (int)stream3.count();
		        System.out.println(i1);
		        stream3.close();
		 }
		
		
       
	}

}
