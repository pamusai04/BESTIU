package Queue;

import java.util.*;
public class Qpractice {
	public static void main(String[] args) {
		//priorty Queue
		//queue is follow the FIFO
		//default capacity is ==  11
		//end of the que is adding elepeents
		//starting of the que retrive elements
		
		//Addtiond - offer, add
		//retrieval - peek
		//removeal  - poll, remove 
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();	
		
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		//System.out.println(pq.remove());  
		pq.offer(25);
		pq.add(105);
		pq.offer(30);
		pq.add(7);
		// pq.offer(null);
		pq.offer(15);
		
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq.remove());
		System.out.println(pq);

		System.out.println(pq.contains(105));
		//System.out.println(pq.size());
		//System.out.println(pq.capacity());
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
		
		PriorityQueue<String> Q = new PriorityQueue<String>(Comparator.reverseOrder());	
		Q.offer("sai");
		Q.offer("lokesh");
		Q.offer("abcde");
		System.out.println(Q);
	}
}
