package itynerds.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutablingList {
	public static void main(String[] args) throws Exception{
		
		try {
			
		List<Integer>numList=new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			numList.add(i);
		}
		
     List<Integer> unmodifiableList = Collections.unmodifiableList(numList);
     System.out.println(unmodifiableList);
     
     //finding first element and lastElement
     
     unmodifiableList.get(0);//first
     unmodifiableList.get(unmodifiableList.size()-1); //last element.
     
     unmodifiableList.add(100);
     System.out.println(unmodifiableList);
	}catch(UnsupportedOperationException e) {
		 System.out.println("Exception thrown :"+e);
		
	}

}
}
