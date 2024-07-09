package linkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Practice1 {

	public static void main(String[] args) {
	 
		
		ArrayList<String>al=new ArrayList<>();
		al.add("s1");
		al.add("s2");
		LinkedList<String> li=new LinkedList<>();
		li.add("y1");
		li.add("y2");
		li.add("y3");
		li.addFirst("first");
		li.add(1, "y7");
		li.addLast("last");
		li.addAll(al);
		System.out.println(li);
		
		
		
		System.out.println(li.get(4));
		
		System.out.println(li.contains("kiran"));
		System.out.println(li.containsAll(al));
		System.out.println(li.contains("last"));
		
		li.set(3, null);
		System.out.println(li);
		
		System.out.println();
		for(String s:li) {
			System.out.println(s);
		}
		
		System.out.println();
		
		
		
		li.remove(); // remove head or tail
		
		li.remove(0);
		li.remove("y3");
		li.removeAll(al);
		li.removeFirst();
		li.removeLast();
		
		
		// li.clear();
		System.out.println(li);
		
		
		
		

	}

}
