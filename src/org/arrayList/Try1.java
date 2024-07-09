package org.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Try1 {

	public static void main(String[] args) {
		
		ArrayList<String>al=new ArrayList<>();
		al.add("prasanna");
		al.add("manju");
		al.add("lathika");
		al.add("prasanna");
		al.add("suresh");
		
		
		ArrayList<String>al1=new ArrayList<>();
		al1.add("amulya");
		al1.add("janaki");
		al1.add("suresh");

		
		al1.addAll(1,al);
		
		System.out.println(al1.size());
		
		String[] str=new String[] {"amma","nanna","ammama","mamayia"};
		//System.out.println(Arrays.toString(str));
		
		ArrayList<String>arrayList=new ArrayList<>(Arrays.asList(str));
		arrayList.addAll(al1);
		System.out.println(arrayList);
		
		
		//foreach... loop
		
		
		for(String str1: arrayList) {
			System.out.println(str1);
		}
		
		
		
		// gives syncronized list..
		Collections.synchronizedCollection(arrayList);
		
	
		
		
		// for loop
		/*
		 * 
		 * for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
			
			//System.out.print(arrayList.get(i)+" ");
		}
		 */
		
		
		
		
	
		
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
			
			System.out.println();
			
			System.out.print(arrayList.get(i)+" vs ");
		}
		
		
		
	}

}
