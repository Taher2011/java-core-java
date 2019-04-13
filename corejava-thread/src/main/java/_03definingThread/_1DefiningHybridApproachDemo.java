package _03definingThread;

class MyThread extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("run method called by Child thread " + Thread.currentThread().getName());
		}
	}
}

public class _1DefiningHybridApproachDemo {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		Thread t1 = new Thread(t);
		t1.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("main method called by Main thread " + Thread.currentThread().getName());
		}

	}

}
