package vector;

import java.util.Arrays;
import java.util.Vector;

public class AddingGet {

	public static void main(String[] args) {
		Vector vs=new Vector();
		
		vs.add("prassana");
		vs.add("raju");
		vs.add(0,"balu");
		vs.add(12);
		vs.add("prassana");
		vs.add("raju");
		vs.add(0,"balu");
		vs.add(12);
		vs.add("prassana");
		vs.add("raju");
		vs.add(0,"balu");
		System.out.println(vs);
		
		Vector vs1=new Vector();
		vs1.add(12);
		vs1.add("prassana");
		vs1.add("raju");
		vs1.add(0,"balu");
		
		/*
		 * adding the elements through iteration may increase the performance..
		 * for(int i=0;i<vs1.size();i++) {
			vs.add(vs1.get(i));
		   System.out.println(vs);
		}
		 */
		 vs.addAll(vs1); // adding the one of the collection in vector..
		 vs.addAll(1,vs1); //adding the one of the collection in location of  vector..
		 System.out.println(vs);
		 
		
		 
		 System.out.println( vs.get(1));  // retriveing the element in list..
		 
		 
		 
		 /* possible outcomes
		  * remove obj in specific index in the vector
		  * remove obj in the vector
		  * remove the collection in vector 
		  * remove the collection in specific index in vector
		  */
		 vs.remove(0); // remove element in specific  index
		 System.out.println(vs);
		 
		 // vs.clear(); // removing all objects in the list...
		 
		 
		 
		 // verfication in the list ..
		 System.out.println(vs.contains("prassana"));
		 System.out.println(vs.containsAll(vs1));
		 
		 Vector vs3=new Vector();
			vs3.add(12);
			vs3.add("prassana");
			vs3.add("raju");
			vs3.add(0,"balu");
		 
	    System.out.println(vs.containsAll(vs3));
		 
		 // modification or updation  in the list..
	    
	     System.out.println(vs);
		 vs.set(0, "Kumar");
		
		 System.out.println(vs);
		
		 
		 //index 
		 System.out.println();
		 System.out.println(vs.indexOf("raju"));
		 System.out.println(vs.lastIndexOf("raju"));
		 
		//isEmpty
		
		//LastElemet and FirstElement..
		
		 System.out.println(vs.firstElement());
		 System.out.println(vs.lastElement()); 
	
		 
		 //vector changing to array.....
		 	Object[] arr = vs.toArray();
		 System.out.println(Arrays.toString(arr));
		
		

	}

}
