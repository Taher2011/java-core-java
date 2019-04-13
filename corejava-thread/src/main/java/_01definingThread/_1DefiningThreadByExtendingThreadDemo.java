package _01definingThread;

class MyThread extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("run method called by Child thread " + Thread.currentThread().getName());
		}
	}
}

public class _1DefiningThreadByExtendingThreadDemo {

	public static void main(String[] args) {
		MyThread t = new MyThread(); // thread instantiation
		t.start();// starting of thread
		for (int i = 0; i < 5; i++) {
			System.out.println("main method called by Main thread " + Thread.currentThread().getName());
		}
	}

}
