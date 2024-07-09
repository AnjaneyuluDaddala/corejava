package vector;

import java.util.Arrays;
import java.util.Vector;

public class VectorSpecific {

	public static void main(String[] args) {
	Vector<Integer> vs=new Vector<>();
	vs.add(12);
	vs.add(34);
	vs.add(89);
	
	Vector<Integer> vs11=new Vector<>();
	vs11.add(90);
	vs11.add(89);
	vs11.add(34);
	vs11.add(1);
	
	vs.addAll(1,vs11);
	
	int sum=0;
	
	for(int i=0;i<vs.size();i++) {
		
		if(i<vs.size()) {
			sum+=vs.get(i);
			int[]arr =new int[vs.size()];
			arr[i]=sum;
			System.out.println(Arrays.toString(arr));
		}
			
		}
		
		
		
		
	}
	
	
	
	}


