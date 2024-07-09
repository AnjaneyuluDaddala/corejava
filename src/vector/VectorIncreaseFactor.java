package vector;

import java.util.Arrays;
import java.util.Vector;

public class VectorIncreaseFactor {

	public static void main(String[] args) {
		Vector v1=new Vector(40);

		v1.add(0, 12);
		v1.add(1, "ramu");
		v1.add(2, "addanki");
		v1.add( "ongole");
		v1.add( 12);
		
		
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		
		
		
		/*
		 * converting array to vector.
		 * Due to this array ,the vector capacity and size are same as in array. 
		 */
		
		Object[] arr=new Object[] {1,2,3,4,5,6};
		Vector v2=new Vector(Arrays.asList(arr));
		System.out.println(v2);
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		
		v2.add("follow");
		System.out.println(v2);
		
	}
	
	
	

}
