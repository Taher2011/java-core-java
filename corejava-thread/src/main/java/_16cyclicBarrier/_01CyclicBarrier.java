package _16cyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/* Cyclic barriers are often used in parallel algorithms and simulations 
   where different threads or tasks need to synchronize at certain points in their execution, 
   typically to perform collective computations.
   
   Here's how it typically works:

Initialization: When creating a cyclic barrier, you specify the number of threads (parties) that must wait at the barrier.

Execution: Each thread performs its task independently until it reaches the barrier point, where it must wait for other threads to catch up.

Waiting: Threads that reach the barrier wait until all the specified number of threads (parties) have reached the barrier.

Releasing: Once all threads have reached the barrier, they are released simultaneously to continue their execution.

Reuse: After all threads have been released, the barrier can be reused for another cycle of computation.
*/

class WorkerThread implements Runnable {

	private String name;
	private CyclicBarrier barrier;

	public WorkerThread(String name, CyclicBarrier barrier) {
		super();
		this.name = name;
		this.barrier = barrier;
	}

	@Override
	public void run() {
		try {
			long timeDuration = (long) (Math.random() * 1000);
			System.out.println(name + " Processing Something for " + timeDuration + " Seconds");
			Thread.sleep(timeDuration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " completed its works");
		try {
			barrier.await();
			System.out.println(name + " has crossed the barrier and continues execution.");
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
	}

}

public class _01CyclicBarrier {

	public static void main(String[] args) {

		CyclicBarrier barrier = new CyclicBarrier(3);

		new Thread(new WorkerThread("Worker1", barrier)).start();
		new Thread(new WorkerThread("Worker2", barrier)).start();
		new Thread(new WorkerThread("Worker3", barrier)).start();
	}

}
