package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PracticeQ2 {

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
		
		System.out.println();
		System.out.println(pq);
		System.out.println();
		
		// we don't get all priority based here so don't use foreach instead use while.
		for( Integer i:pq) {
			
			System.out.println(i);
			
		}
		System.out.println("Ascending Order--->");
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}


	}

}
