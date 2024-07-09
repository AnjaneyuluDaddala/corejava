package itynerds.collections;

import java.util.Arrays;
import java.util.*;

public class LinkedListCollection {
	
public static void main(String[] args) {
	String[] names= {"kiran","siva","geerish","likitha","anjan"};
	
//	List<String> ArraysList = Arrays.asList(names);
	
//	LinkedList<String> linkedList=new LinkedList<>(ArraysList); 
	
//	for(String namesInList:linkedList) {
//		System.out.println(namesInList);
//		
//	}
//	
	
	LinkedList<String> linkedList=new LinkedList<>();
	Collections.addAll(linkedList, names);
	System.out.println(linkedList);
	
}

}
