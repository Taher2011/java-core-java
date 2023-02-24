package _09interThreadComm;

import java.util.LinkedList;
import java.util.Queue;

/*wait()
It tells the calling thread to give up the lock and go to sleep until some other thread enters the same monitor and calls notify(). */


/*notify()
It wakes up one single thread that called wait() on the same object. It should be noted that calling notify() does not actually give up a lock on a resource. It tells a waiting thread that that thread can wake up. However, the lock is not actually given up until the notifier’s synchronized block has completed.

So, if a notifier calls notify() on a resource but the notifier still needs to perform 10 seconds of actions on the resource within its synchronized block, the thread that had been waiting will need to wait at least another additional 10 seconds for the notifier to release the lock on the object, even though notify() had been called.
*/

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
