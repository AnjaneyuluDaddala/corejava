package collections;

import java.util.ArrayList;
import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		
	/*
	 * key is not duplicte and object can duplicate..key may be null also
	 */
		HashMap<Integer,String> map=new HashMap();
		HashMap map1=new HashMap();
		
		map.put(1, "hello");
		
		map1.put("bye", 2);
		map1.put("jwala", "nono");
		
		String Str =map.get(1);
		System.out.println("String = "+Str);
		System.out.println(map.get("bye"));
		
		System.out.println(map1.get("bye"));

		
		
		
		HashMap<String,Arraylist1> amazon=new HashMap<String,Arraylist1>();
		
		Arraylist1 refer=new Arraylist1();
		//refer.mobileList();
		 
		//amazon.put("mobiles",mobileList);
		//amazon.put("Electronic", ElectronicList);
		
		
		
		
	}

}
