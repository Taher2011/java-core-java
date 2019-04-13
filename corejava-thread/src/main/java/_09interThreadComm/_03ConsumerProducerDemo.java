package _09interThreadComm;

import java.util.LinkedList;
import java.util.Queue;

class ProducerThread extends Thread {

	public Queue<Integer> queue;
	public int size;

	public ProducerThread(Queue<Integer> queue, int size) {
		super();
		this.queue = queue;
		this.size = size;
	}

	public void run() {
		while (true) {
			synchronized (queue) {
				if (queue.isEmpty()) {
					System.out.println("Queue is empty and Producer thread is adding element in to queue");
					for (int i = 0; i < size; i++) {
						queue.add(i);
					}
					queue.notify();
				} else {
					System.out.println("Queue is not empty and Producer thread has to wait to add the elements in queue");
					try {
						queue.wait();
					} catch (InterruptedException e) {
						System.out.println("Excpetion occured due to " + e.getMessage());
					}
				}
			}
		}
	}

}

class ConsumerThread extends Thread {

	public Queue<Integer> queue;

	public ConsumerThread(Queue<Integer> queue) {
		super();
		this.queue = queue;
	}

	public void run() {
		while (true) {
			synchronized (queue) {
				if (queue.isEmpty()) {
					System.out.println("Queue is empty and Consumer thread has to wait");
					try {
						queue.wait();
					} catch (InterruptedException e) {
						System.out.println("Excpetion occured due to " + e.getMessage());
					}
				} else {
					System.out.println("Queue is not empty and Consumer thread is consuming");
					int element = queue.remove();
					System.out.println("Removed " + element + " Consumer thread notifiying");
					queue.notify();
				}
			}
		}
	}
}

public class _03ConsumerProducerDemo {

	public static void main(String[] args) throws InterruptedException {

		Queue<Integer> queue = new LinkedList<>();
		int size = 5;

		ProducerThread pt = new ProducerThread(queue, size);
		ConsumerThread ct = new ConsumerThread(queue);
		ct.start();
		Thread.sleep(1000);
		pt.start();
	}

}
