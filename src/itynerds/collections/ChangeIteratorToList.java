package itynerds.collections;

import java.util.*;

public class ChangeIteratorToList {
	
	public  static <T> List<T> getList(Iterator<T> iterator){
		
		
		List<T> list =new ArrayList<>();
		
		iterator.forEachRemaining(list::add);
		
		return list;
	}
	
	public static void main(String[] args) {
		
		Iterator<Integer>iterator=Arrays.asList(1,2,34,4).iterator();
		
	    List<Integer> list = getList(iterator);
	    System.out.println(list);
		
	}

}
