package _09interThreadComm;

import java.util.ArrayList;
import java.util.List;

/*wait()
It tells the calling thread to give up the lock and go to sleep until some other thread enters the same monitor and calls notify(). */


/*notify()
It wakes up one single thread that called wait() on the same object. It should be noted that calling notify() does not actually give up a lock on a resource. It tells a waiting thread that that thread can wake up. However, the lock is not actually given up until the notifier’s synchronized block has completed.
So, if a notifier calls notify() on a resource but the notifier still needs to perform 10 seconds of actions on the resource within its synchronized block, the thread that had been waiting will need to wait at least another additional 10 seconds for the notifier to release the lock on the object, even though notify() had been called.
*/


public class _04ConsumerProducerDemo {

	private List<Integer> list = new ArrayList<>();
	private static int UPPER_LIMIT = 5;
	private static int LOWER_LIMIT = 0;
	private Object lock = new Object();
	private int value = 0;

	public void producer() throws InterruptedException {

		synchronized (lock) {

			while (true) {
				if (list.size() == UPPER_LIMIT) {
					System.out.println("waiting for removing items...");
					lock.wait();
					value = 0;
				} else {
					list.add(value);
					System.out.println("Adding: " + value);
					value++;
					lock.notify();
				}
				Thread.sleep(500);
			}

		}
	}

	public void consumer() throws InterruptedException {

		synchronized (lock) {

			while (true) {
				if (list.size() == LOWER_LIMIT) {
					System.out.println("waiting for adding items...");
					lock.wait();
				} else {
					System.out.println("Removing: " + list.remove(list.size() - 1));
					lock.notify();
				}
				Thread.sleep(500);
			}

		}
	}

	public static void main(String[] args) {

		_04ConsumerProducerDemo processor = new _04ConsumerProducerDemo();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					processor.producer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					processor.consumer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		t1.start();
		t2.start();

	}

}
