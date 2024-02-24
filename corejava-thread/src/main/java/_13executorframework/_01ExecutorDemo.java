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

class Job implements Runnable {

	String name;

	public Job(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {

		System.out.println(name + " job started by " + Thread.currentThread().getName());

		System.out.println();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(name + " job completed by " + Thread.currentThread().getName());

		System.out.println();
	}

}

public class _01ExecutorDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Job[] jobs = { new Job("testing"), new Job("developing"), new Job("meeting"), new Job("managing") };

		ExecutorService executorService = Executors.newFixedThreadPool(3);
		for (Job job : jobs) {
			executorService.execute(job);
		}
		executorService.shutdown();
	}

}
