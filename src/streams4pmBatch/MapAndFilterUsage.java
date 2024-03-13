package streams4pmBatch;

import java.util.*;

public class MapAndFilterUsage {

	public static void main(String[] args) {
		 List<String> memberNames = new ArrayList<>();
		    memberNames.add("amitabh");
		    memberNames.add("shekhar");
		    memberNames.add("aman");
		    memberNames.add("rahul");
		    memberNames.add("shahrukh");
		    memberNames.add("salman");
		    memberNames.add("yana");
		    memberNames.add("lokesh");
		    
		    memberNames.stream().filter(n -> n.startsWith("s")).map(String::toUpperCase)
		    .forEach(n -> System.out.println(n));
		    
		    

	}

}
