package _15countdownlatch;

import java.util.concurrent.CountDownLatch;

/* The CountDownLatch named latch ensures that the main thread waits until all worker threads complete their tasks. 
   Each worker thread decrements the latch count when it finishes its task. 
   Once all tasks are completed and the latch count reaches zero, the main thread proceeds with its execution.*/

class ProcessThread implements Runnable {

	CountDownLatch latch;
	long workDuration;
	String name;

	public ProcessThread(String name, CountDownLatch latch, long duration) {
		this.name = name;
		this.latch = latch;
		this.workDuration = duration;
	}

	public void run() {
		try {
			System.out.println(name + " Processing Something for " + workDuration / 1000 + " Seconds");
			Thread.sleep(workDuration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + "completed its works");
		// when task finished.. count down the latch count...

		// basically this is same as calling lock object notify(), and object here is
		// latch
		latch.countDown();
	}

}

public class _01CountDownLatch {

	public static void main(String[] args) {// Parent thread creating a latch object
		CountDownLatch latch = new CountDownLatch(3);

		new Thread(new ProcessThread("Worker1", latch, 2000)).start(); // time in millis.. 2 secs
		new Thread(new ProcessThread("Worker2", latch, 6000)).start();// 6 secs
		new Thread(new ProcessThread("Worker3", latch, 4000)).start();// 4 secs

		System.out.println("waiting for Children processes to complete....");
		try {
			// current thread will get notified if all chidren's are done
			// and thread will resume from wait() mode.
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("All Process Completed....");

		System.out.println("Parent Thread Resuming work....");

	}

}
