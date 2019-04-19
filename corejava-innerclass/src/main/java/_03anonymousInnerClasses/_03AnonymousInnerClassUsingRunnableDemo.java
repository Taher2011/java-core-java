package _03anonymousInnerClasses;

class MyThread1 implements Runnable {

	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println("Child Thread using Normal approach");
		}
	}
}

public class _03AnonymousInnerClassUsingRunnableDemo {

	public static void main(String[] args) {

		Runnable r = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 2; i++) {
					System.out.println("Child Thread using Anonymous approach");
				}
			}
		};
		Thread t1 = new Thread(r);
		t1.start();

		MyThread1 mt = new MyThread1();
		Thread t2 = new Thread(mt);
		t2.start();

		for (int i = 0; i < 2; i++) {
			System.out.println("Main Thread");
		}
	}

}
