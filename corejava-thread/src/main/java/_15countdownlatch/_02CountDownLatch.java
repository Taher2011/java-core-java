package _15countdownlatch;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* The CountDownLatch named latch ensures that the main thread waits until all worker threads complete their tasks. 
   Each worker thread decrements the latch count when it finishes its task. 
   Once all tasks are completed and the latch count reaches zero, the main thread proceeds with its execution.*/

class ProcessThread1 implements Runnable {

	CountDownLatch latch;
	long workDuration;
	String name;

	public ProcessThread1(String name, long duration) {
		this.name = name;
		this.workDuration = duration;
	}

	public void run() {
		try {
			System.out.println(name + " Processing Something for " + workDuration / 1000 + " Seconds");
			Thread.sleep(workDuration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " completed its works");
		// when task finished.. count down the latch count...

		// basically this is same as calling lock object notify(), and object here is
		// latch
		latch.countDown();
	}

}

public class _02CountDownLatch {

	public static void main(String[] args) {// Parent thread creating a latch object

		List<ProcessThread1> processThreads = new ArrayList<>();
		processThreads.add(new ProcessThread1("Process1", 2000));
		processThreads.add(new ProcessThread1("Process2", 6000));
		processThreads.add(new ProcessThread1("Process3", 4000));

		CountDownLatch latch = new CountDownLatch(processThreads.size());

		ExecutorService executorService = Executors.newFixedThreadPool(2);
		for (ProcessThread1 processThread : processThreads) {
			processThread.latch = latch;
			executorService.execute(processThread);
		}
		executorService.shutdown();

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
