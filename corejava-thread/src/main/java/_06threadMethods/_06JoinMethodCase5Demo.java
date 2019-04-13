package _06threadMethods;

/*
Below program will cause Deadlock as main-thread is calling join() on main-thread object itself at line 21
due to which main-thread will wait forever.
*/

class MyThreadP extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread");
		}
	}
}

public class _06JoinMethodCase5Demo {

	public static void main(String[] args) throws InterruptedException {
		MyThreadP t = new MyThreadP();
		Thread.currentThread().join();
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread");
		}

	}

}
