package Queue;

import java.util.*;
public class Dqueue {
	public static void main(String[] args) {
		ArrayDeque<String> dq = new ArrayDeque<String>();
		//default capacity =  17
		
		//both start and end insertion and deletion of the elements 
		// addition - offer(), offerFirst(), offerLast(),add(), addFirst()
		//addLast(), pollFirst(), pollLast(), removeFirst(), removeLast()
		
		dq.add("cherry");
		dq.addFirst("banana");
		dq.addLast("Apple");
		dq.offerFirst("kiwi");
		dq.offerLast("paper");
		dq.offer("mango");
		System.out.println(dq);
		System.out.println("******************");
		
		System.out.println(dq.poll());
		System.out.println(dq);
		
		System.out.println(dq.pollFirst());
		System.out.println(dq);
		
		System.out.println(dq.pollLast());
		System.out.println(dq);
	
	}
}
