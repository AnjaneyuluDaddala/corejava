package streamsAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Try2 {

	public static void main(String[] args) {
		
		List<Integer>li=new ArrayList<Integer>();
		for(int i=0;i<100;i++) li.add(i);
		
		Stream<Integer>sequential=li.stream();
		Stream<Integer>number=sequential.filter(p->p>90);
		number.forEach(p->System.out.println("high numbers : "+p));
		

	}

}
