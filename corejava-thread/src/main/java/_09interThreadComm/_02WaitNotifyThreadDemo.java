package _09interThreadComm;

class ThreadB extends Thread {

	int total = 0;

	public void run() {
		synchronized (this) {
			System.out.println("Child thread started calculation");
			for (int i = 0; i <= 10; i++) {
				total = total + i;
				System.out.println(total);
			}
			System.out.println("Child thread calling notify method");
			this.notify();
		}
	}
}

public class _02WaitNotifyThreadDemo {

	/* Case 2 , When Child thread got chance first to execute */
	public static void main(String[] args) throws InterruptedException {
		ThreadB t = new ThreadB();
		t.start();
		Thread.sleep(100);
		synchronized (t) {
			System.out.println("Main thread calling wait method");
			t.wait(1000); //t.wait() ,,then thread would in waiting state for infinite amount of time
		}
		System.out.println("Main thread got notification call");
		System.out.println("total " + t.total);
	}
}
