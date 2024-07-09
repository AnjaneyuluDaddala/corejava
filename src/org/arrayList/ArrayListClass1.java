package org.arrayList;

import java.util.ArrayList;

public class ArrayListClass1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList(10);
		al.add(12);
		al.add(78);
		System.out.println(al);
		System.out.println(al.size());
		
		// trim method is conctrete method of arraylist (it is used to saves the memeory of arrayList..
		al.trimToSize();
		
		
		al.ensureCapacity(12); // increase the capacity by user problemtically not depending the loadFactor..
		
		
		

	}

}
