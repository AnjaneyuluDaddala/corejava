package hashMap;
import java.util.*;
public class Practice2 {

	public static void main(String[] args) {
		Map<Integer,String>map =new Hashtable<>();
        map.put(23, "Hyderabad");
        map.put(45, "pune");
        map.put(23, "kolkata");
        map.put(25, "mumbai");
        //map.put(null, "vizag");
        
         // update or override;
        map.put(25, "dubai");
        
        
      
        
        // if you dont want to override use this below method.
        //if 25 key have any value is inserted before ,the below is not override
        map.putIfAbsent(25, "vijayawada");
        
        System.out.println(  map.size());
        
  // Another method for updates
        
        map.replace(45, "ongole");
        map.replace(23, "Hyderabad", "Telangana");
        
        System.out.println( map.containsKey(23));
        System.out.println(  map.containsValue("pune"));
      
        
        map.remove(23);
        map.remove(25, "mumbai");
        System.out.println(map);
        
        
        map.clear();
        System.out.println(map);
        
        
	}  
	
	

}
