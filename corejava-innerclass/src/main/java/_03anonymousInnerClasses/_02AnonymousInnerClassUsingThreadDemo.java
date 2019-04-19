package _03anonymousInnerClasses;

class MyThread extends Thread {

	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println("Child Thread using Normal approach");
		}
	}
}

public class _02AnonymousInnerClassUsingThreadDemo {

	public static void main(String[] args) {

		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 2; i++) {
					System.out.println("Child Thread using Anonymous approach");
				}
			}
		};
		t1.start();

		Thread t2 = new MyThread();
		t2.start();

		for (int i = 0; i < 2; i++) {
			System.out.println("Main Thread");
		}
	}

}
