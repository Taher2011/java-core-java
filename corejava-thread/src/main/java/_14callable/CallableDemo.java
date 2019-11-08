package _14callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* In the case of Runnable job, thread doesn't return anything after 
   completing job. But in case of Callable job, thread returns some
   result after completing job and return type is of type Future.
   It contains only one method call().
*/

class Job implements Callable<Integer> {

	int num;

	public Job(int num) {
		super();
		this.num = num;
	}

	@Override
	public Integer call() throws Exception {

		System.out.println(
				Thread.currentThread().getName() + " is responsible to find multiple of first " + num + " number");

		int sum = 2;
		sum = sum * num;
		return sum;
	}

}

public class CallableDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Job[] jobs = { new Job(10), new Job(20), new Job(30), new Job(40) };

		ExecutorService executorService = Executors.newFixedThreadPool(3);
		for (Job job : jobs) {
			Future<Integer> future = executorService.submit(job);
			Integer sum = future.get();
			System.out.println(sum);
			System.out.println();
		}
		executorService.shutdown();
	}

}
