package queue;

import java.util.*;

public class QueuePractice {

	public static void main(String[] args) {
		Queue<Integer> pq=new PriorityQueue<>();
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.peek());
		System.out.println(pq);
		
		pq.add(189);
		pq.add(34);
		pq.offer(189);
		pq.offer(22);
		pq.offer(1);
		pq.offer(22);
		pq.add(34);
		//pq.offer(null);  // not accept NullPointerException
		//pq.add(null);
		System.out.println();
		System.out.println(pq);
		
		System.out.println(pq.peek()); // returns only head of highest priority value
		System.out.println();
		
		System.out.println(pq.poll()); // removes head value.
		System.out.println();
		System.out.println(pq);
		System.out.println();
		System.out.println(pq.contains(34));
		System.out.println();
		
		pq.clear();
		System.out.println(pq.poll());
		System.out.println(pq.remove());
		System.out.println();
		
		
		
		
		
		
		

	}

}
