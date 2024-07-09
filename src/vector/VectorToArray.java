package vector;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import java.util.function.Consumer;



public class VectorToArray {

	public static void main(String[] args) {
		Vector vs=new Vector();
		vs.add("raju");
		vs.add("namana");
		Vector vs1=new Vector(20);
		vs1.add(0, 90);
		vs1.add(1,"jwalaal");
		
		
	
		
		vs.add(0, vs1);
		
		System.out.println(vs);
		
		Object[] arr=vs.toArray();
		
		//System.out.println(Arrays.toString(arr));
		
	

		// changing array to vector..
		Object[] arr1=new Object[]{1,2,3,"gitaa"};
		//System.out.println(Arrays.toString(arr1));
		
		Vector n1=new Vector(Arrays.asList(arr1));
		//System.out.println(n1);
		int sum=0;
		
		for(int i=0;i<n1.size();i++) {
			sum+= (Integer)n1.get(i);
		}
		System.out.println(n1);
		

	}

}
