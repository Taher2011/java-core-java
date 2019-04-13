package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMethodDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.offer("Q");
		queue.offer("Q");
		queue.offer("F");
		queue.offer("B");
		queue.offer("E");
		queue.offer("W");
		queue.offer("J");
		queue.offer("V");
		
		System.out.println("Queue is " + queue);
		System.out.println("Size is " + queue.size());
		System.out.println(queue.offer("T"));
		System.out.println("Queue is " + queue);
		System.out.println("Size is " + queue.size());
		
		System.out.println("poll() " + queue.poll()); //Retrieves and removes the head of this queue, or returns null if this queue is empty.
		System.out.println("Queue is " + queue);
		System.out.println("Size is " + queue.size());
		System.out.println("remove() " +queue.remove()); //Retrieves and removes the head of this queue. This method differs from poll only in that it throws an exception if this queue is empty.
		System.out.println("Queue is " + queue);
		System.out.println("Size is " + queue.size());
		
		System.out.println("peek() " + queue.peek()); //Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
		System.out.println("peek() " + queue.element()); //Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.


		
	}

}

