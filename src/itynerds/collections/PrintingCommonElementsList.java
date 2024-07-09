package itynerds.collections;

import java.util.*;


public class PrintingCommonElementsList {
	
	public static void main(String[] args) {
        ArrayList<String>  list1 = new ArrayList<>(); 

    list1.add("Hii"); 
    list1.add("Geeks"); 
    list1.add("for"); 
    list1.add("Geeks");
    
    
    ArrayList<String>list2 = new ArrayList<String>(); 

     list2.add("Hii"); 
     list2.add("Geeks"); 
     list2.add("Gaurav"); 

     //Given duplicate values or common values.
//     list1.retainAll(list2);
//     System.out.println(list1);
     
     
   //or 
 	// Native apporach
     
     List<String>list3=new ArrayList<>();
 	  for (String temp : list1) { 
 		  
           // Check if the element is 
           // present in list2 or not 
           if (list2.contains(temp)) { 

               // Since present, add it to list3 
               list3.add(temp); 
           } 
       } 

       // print common elements from list 3 
       System.out.println("Common elements: "
                          + list3); 
   } 

     
     
     
     //or 
     
//     System.out.println(list1.stream() 
//             .filter(list2::contains) 
//             .collect(Collectors.toList())); 
//	}
//	
	
}
