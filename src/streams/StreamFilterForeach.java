package streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamFilterForeach {

	public static void main(String[] args) {
		
		
		
		Student st1=new Student(11912,"prasana","batch-34","CSE","Vedait");
		Student st2=new Student(11922,"gunna","batch-24","ECE","Vedait");
		Student st3=new Student(11911,"sowmya","batch-34","CSE","Vedait");
		Student st4=new Student(1912,"Bhavana","batch-4","IT","Chaitanya");
		
		ArrayList<Student>al=new ArrayList<>();
		al.add(st1);
		al.add(st2);
		al.add(st3);
		al.add(st4);
		
		
		Stream<Student> s1=al.stream();
		s1.filter(x->x.getCourse()=="CSE").forEach(n->System.out.println(n.getName()));
		
		
	
		
		
	/*	
		
		Stream<Integer> stream=Stream.of(19,2,3,13,3,2,10);
		stream.filter(x->x>9).forEach(a->System.out.println(a));
*/
	}

}
