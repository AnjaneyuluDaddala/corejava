package iterator11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class New {

	public static void main(String[] args) {
		
		List<Integer> al=new ArrayList<Integer>();
	 
		for(int i=0;i<100;i++) {
			if(i%2==0) {
				al.add(i);
			}
			else {
				new ArrayList().add(i);
			}
		}	
		Iterator<Integer>itr=al.iterator();
		System.out.println("Printing even numbers are  :");
		while(itr.hasNext()) {
			Integer i=itr.next();
			System.out.println(i);
		}

	}

}
