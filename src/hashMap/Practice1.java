package hashMap;
import java.util.*;
public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map=new Hashtable<>();
		map.put(1, "Prasanna");
		map.put(2, "amulya");
		map.put(3, "ajay");
		
		
		//Retrivel of keys. using set ketSet is like list .
		Set<Integer> set=map.keySet();
		for(Integer i:set) {
			System.out.println(i);
		}
		
		
		//Retrivel of values.
		System.out.println();
		Iterable<String> str=map.values();
		str.forEach(t ->System.out.println(t));
		System.out.println();
		
		
		Collection<String> str1=map.values();
		for(String s:str1) {
			System.out.println(s);
		}
		
		
		// Retrivel of value from map based on key.

		System.out.println();
		System.out.println(map.get(2));
		
		
		// key and value of iteration.
		
		Collection<Integer> str2=map.keySet();
		for(Integer s:str2) {
			System.out.println(s +" >>>>> values are " +map.get(s));
		}
	}

}
