package _06threadMethods;

class MyThread extends Thread {
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread");
			Thread.yield();
		}
	}
}

public class _01YieldMethodDemo {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}

}
