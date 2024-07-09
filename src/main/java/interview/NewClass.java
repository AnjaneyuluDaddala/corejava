package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NewClass {
	
	
	public static void main(String[] args) {
		
		
		List<Integer>list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		List<Integer> sqOfNumbs = list.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(sqOfNumbs);
		
		
	}

}
