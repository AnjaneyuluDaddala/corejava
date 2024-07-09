package deque;

import java.util.*;

public class DequeArray {

	public static void main(String[] args) {
		ArrayDeque<String> ad=new ArrayDeque<>();
        ad.add("banana");
        ad.addFirst("cherry");
        ad.addLast("carrot");
        
        ad.offer("kiwi");
        ad.offerFirst("Apple");
        ad.offerLast("grapes");
        
        System.out.println(ad);
        System.out.println();
        
        System.out.println(ad.peek());
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());
        
        
        System.out.println();
        
        System.out.println(ad.poll());
        System.out.println(ad.pollFirst());
        System.out.println(ad.pollLast());
        
        System.out.println();
        System.out.println(ad);
        System.out.println(ad.size());
         
	}

}
