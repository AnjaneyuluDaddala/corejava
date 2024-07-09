package org.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {

		int[] marks = new int[7];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 6 integer elements in array ");
		
		for (int i = 0; i <= marks.length - 1; i++) {
			System.out.print("marks[" + i + "] = ");
			marks[i] = sc.nextInt();
		}
		
		for(int i=0;i<=marks.length-1;i++) {
			System.out.println("marks["+i+"] = "+marks[i]);
		}
		
		ArrayList ar=new ArrayList();
		
		ar.add("ram");
	    ar.add(0, 34);
	    ar.add(1,marks);
	    
	    System.out.println(ar.get(1));
	    
	    int[] temp = (int[]) ar.get(1);
	    
	    for(int i:temp) {
	    	System.out.println(i);
	    }
	    
	    
		
		/*	
		    
		    
			System.out.println(ar.size());
			
			System.out.println(ar.get(1));// get the element of specific index
			 
			ar.clear();// removing all elements in the list.
			ar.clone();// shallow copy of the arrayList instance.
			boolean contain=ar.contains(marks);
			System.out.println(contain);
			
			ar.ensureCapacity(19); // increase the ensure capacity..
			
			ar.indexOf(marks);// finding the index of the object..
			
			ar.isEmpty();// if it is empty gives true..
			
			ar.remove(1); // remove the index of the object
			ar.remove(marks);// remove the obj of index.
			
			
			
			
			ar.removeIf(null);//predicate
			
			//ar.removeRange(0, 1); //from index to to index respectively..
			
			
			
			ar.forEach(i->System.out.println(i));
			
			/*
			marks[0]=sc.nextInt();
			marks[1]=sc.nextInt();
			marks[2]=sc.nextInt();
			marks[3]=sc.nextInt();
			marks[4]=sc.nextInt();
			marks[5]=sc.nextInt();
			marks[6]=sc.nextInt();
			*/
	    
	   

	}

}
