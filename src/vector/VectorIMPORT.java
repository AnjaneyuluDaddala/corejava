package vector;

import java.util.Arrays;
import java.util.Vector;

public class VectorIMPORT {

	public static void main(String[] args) {
		Object[] arr=new Object[] {1,2,3,4,5,6};
		
		Vector v2=new Vector(Arrays.asList(arr));
		v2.add("ravana");
		int sum=0;
		
		try {
			
		
		for(int i=0;i<v2.size();i++) {
			sum+= (Integer)v2.get(i);
			
		}
		
		System.out.println(v2);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		
	}

}
