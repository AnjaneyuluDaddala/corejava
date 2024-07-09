package itynerds.collections;

import java.util.*;

public class ReturningArray {
	
	public static <T> Object[] convertArray(LinkedList<T> linkedList) {
		
		Object[] array = linkedList.toArray();		
		return array;
			
	}
	
	public static void main(String[] args) {
		
		
		LinkedList<String> linkedList=new LinkedList<>();
         linkedList.add("A");
         linkedList.add("B");
         linkedList.add("C");
         linkedList.add("D");
         linkedList.add("E");

         Object[] convertArray = convertArray(linkedList);
         System.out.println("Array ="+Arrays.toString(convertArray));
         
}
}
