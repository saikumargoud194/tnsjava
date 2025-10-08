

import java.util.PriorityQueue;
public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<String> pq =new PriorityQueue<>();
		
		pq.add("sai");
		
		pq.add("sai Reddy");
		
		pq.add("vamshi bittu ");
		
		System.out.println(pq);
		
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
		

	}

}
