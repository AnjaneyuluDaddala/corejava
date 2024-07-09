package itynerds.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayCollection {
	
	
	public static void main(String[] args) {
		
		List<Integer>numList=new ArrayList<>();
		
		for(int i=0;i<100;i++) {
			if(i%2==0) {
				numList.add(i);
				System.out.println("Even numbers are :"+numList);
				System.out.println();
			}else {
			   List<Integer> ListOdd = Arrays.asList(i);
			   System.out.println("Odd numbers are :"+ListOdd);
			}
		}
		
	

}
}
