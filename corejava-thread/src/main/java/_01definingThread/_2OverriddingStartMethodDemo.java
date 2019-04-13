package _01definingThread;

class MyThreadN extends Thread {

	public void start() {
		System.out.println("override start() before calling Thread's class start() called by " + Thread.currentThread().getName());
		super.start();
		System.out.println("override start() after calling Thread's class start() called by " + Thread.currentThread().getName());
	}
	
	public void run() {
		System.out.println("run Method called by " + Thread.currentThread().getName());
	}
}

public class _2OverriddingStartMethodDemo {

	public static void main(String[] args) {
		System.out.println("main method called by " + Thread.currentThread().getName());
		MyThreadN t = new  MyThreadN();
		t.start();
		System.out.println("main method called by " + Thread.currentThread().getName());
	}

}
