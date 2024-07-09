package hashMap;

import java.util.*;
import java.util.Map.Entry;


public class Entrysetmap {

	public static void main(String[] args) {
		Map<Integer,String>map =new TreeMap<>();
        map.put(23, "Hyderabad");
        map.put(45, "pune");
        map.put(23, "kolkata");
        map.put(25, "mumbai");
        //map.put(null, "vizag");
        
       Set<Entry<Integer,String>> e=   map.entrySet();
       for(Entry<Integer,String> entry:e) {
    	   Integer key= entry.getKey();
    	   String value=entry.getValue();
    	   
    	   System.out.println(key +"  >>> "+value);
    	   
       }
	}

}
