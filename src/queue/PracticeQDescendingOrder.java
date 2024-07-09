package queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PracticeQDescendingOrder {

	public static void main(String[] args) {
		Queue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
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
		System.out.println(pq);
		System.out.println();
		
		System.out.println("Descending Order--->");
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
		

	}

}
