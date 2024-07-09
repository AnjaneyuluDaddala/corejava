package vector;

import java.util.ArrayList;
import java.util.Vector;

public class SizeAndCapacity {

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
	
	//System.out.println(vs);
   System.out.println("Size of vector = "+vs.size());
   System.out.println("Capacity of vector = "+vs.capacity());
   
   
	vs.add(12);
	vs.add(0,"balu");
	vs.add(12);
	vs.add("prassana");
	vs.add("raju");
	vs.add(0,"balu");
	vs.add(12);
	vs.add("prassana");
	vs.add("raju");
	//System.out.println(vs);
	
	//System.out.println("Size of vector = "+vs.size());
	//System.out.println("Capacity of vector = "+vs.capacity());
	
	

	

	
	}

}
