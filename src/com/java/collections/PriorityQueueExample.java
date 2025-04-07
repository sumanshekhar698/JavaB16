package com.java.collections;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
//		PriorityQueue<Integer> que = new <Integer>PriorityQueue();
		
		PriorityQueue<Integer> que = new <Integer>PriorityQueue(Collections.reverseOrder());//Max Heap :: Biggest Number

		
//		The highest priority number will be in top
//		Default :: Smallest number
//		MinHeap
//		log n
		que.add(23);
		que.add(233);
		que.add(223123);
		que.add(223);
		que.add(233);

		que.add(675);
		que.add(24);
		que.add(45);
		
		
		System.out.println(que);
//		Order is not mentioned, so no index access
		
		System.out.println(que.poll());
		System.out.println(que);
		
		System.out.println(que.poll());
		System.out.println(que);
		
		System.out.println(que.poll());
		System.out.println(que);
		
		System.out.println(que.poll());
		System.out.println(que);
		
		System.out.println(que.poll());
		System.out.println(que);
		
		
		System.out.println(que.peek());
		System.out.println(que);

	}

}
