package _02definingThread;

class MyRunable implements Runnable {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("run method called by Child thread " + Thread.currentThread().getName());
		}
	}
}

public class _1DefiningThreadByImplRunnableDemo {

	public static void main(String[] args) {
		Runnable r = new MyRunable();
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("main method called by Main thread " + Thread.currentThread().getName());
		}
	}

}
