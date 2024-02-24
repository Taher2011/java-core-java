package _13executorframework;

import java.util.concurrent.ExecutionException;

/* Creating a thread for every job may create performance and memory problems 
   so its not recommended to create separate thread for every job.
   To overcome this we should create ThreadPool. It is a pool of already created threads
   which are ready to perform jobs. ThreadPool also known as Executor Framework.
   In below program 3 threads are responsible to execute 4 jobs so that a single
   thread can be used for multiple jobs.
   
   In summary, thread pool is a fundamental component used by the Executor Framework to manage the execution of tasks asynchronously 
   by reusing a fixed number of threads. 
*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {

	private int taskId;

	public Task(int taskId) {
		super();
		this.taskId = taskId;
	}

	@Override
	public void run() {
		try {
			System.out.println("task " + taskId + " called by thread " + Thread.currentThread().getName());
			Thread.sleep(500);
			System.out.println("task " + taskId + " completed by thread " + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

public class _02ExecutorDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		for (int i = 0; i < 5; i++) {
			Thread t = new Thread(new Task(i));
			t.start();
		}

		Thread.sleep(5000);

		System.out.println("=================================");

		ExecutorService executorService = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 5; i++) {
			executorService.execute(new Task(i));
		}

	}

}
