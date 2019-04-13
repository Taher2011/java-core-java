package _09interThreadComm;

class ThreadA extends Thread {

	int total = 0;

	public void run() {
		synchronized (this) {
			System.out.println("Child thread started calculation");
			for (int i = 0; i <= 5; i++) {
				total = total + i;
				System.out.println(total);
			}
			System.out.println("Child thread calling notify method");
			this.notify();
		}
	}
}

public class _01WaitNotifyThreadDemo {

	/* Case 1 , When Main thread got chance first to execute */
	public static void main(String[] args) throws InterruptedException {
		ThreadA t = new ThreadA();
		t.start();
		synchronized (t) {
			System.out.println("Main thread calling wait method");
			t.wait();
		}
		System.out.println("Main thread got notification call");
		System.out.println("total " + t.total);
	}
}
