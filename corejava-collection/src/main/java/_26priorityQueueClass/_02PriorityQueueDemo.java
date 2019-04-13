package _26priorityQueueClass;

import java.util.PriorityQueue;


public class _02PriorityQueueDemo {
	
	public static void main(String[] args) {
		
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.offer("Q");
		queue.offer("B");
		queue.offer("W");
		queue.offer("F");
		queue.offer("A");
		System.out.println("offer() add object into the queue." + queue.offer("A"));
		System.out.println(queue);
		
		System.out.println();
		System.out.println("poll() remove and returns the head element of the queue." + queue.poll());
		System.out.println(queue);
		
		System.out.println();
		System.out.println("remove() remove and returns the head element of the queue and if queue is empty it raises NoSuchElementException." + queue.remove());
		System.out.println(queue);
		
		System.out.println();
		System.out.println("peek() returns the head element of the queue." + queue.peek());
		System.out.println("element() returns the head element of the queue and if queue is empty it raises NoSuchElementException." + queue.element());
		
	}
}
