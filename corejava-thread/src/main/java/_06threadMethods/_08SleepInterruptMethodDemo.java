package _06threadMethods;

class MyThreadO extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Lazy Thread");
		}
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Sleeping");
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println("exception because " + e.getMessage());
		}
	}
}

public class _08SleepInterruptMethodDemo {

	public static void main(String[] args) {
		MyThreadO t = new MyThreadO();
		t.start();
		t.interrupt();
		System.out.println("End of main thread");

	}

}
