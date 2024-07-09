package hashMap;

import java.util.HashMap;
import java.util.Map;

public class Hash1 {

	public static void main(String[] args) {
		
		// no duplication 
		// but have null 
		// while using gentrics not accept null
		
		Map map=new HashMap();
		map.put("Electronics",20 );
		map.put(10,20 );
		map.put("Electronics",80 );
		
		map.put(null,20);
		map.put(20,null);
		
		System.out.println(map);
		System.out.println(map.get("Electronics"));
/**
 * 		map.remove(10);
		map.remove(10, 20);
		
		map.replace(10, 30);
		map.replace(10, 20, 50);
		
		map.clear();
			
 */
		
		System.out.println(map.keySet());
		System.out.println(map.entrySet()); // is same as System.out.println(map);
		
		
		
		
		
		
		
		

	}

}
