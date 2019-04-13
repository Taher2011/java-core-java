package _06threadMethods;

class MyThreadN extends Thread {

	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Lazy Thread");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("exception because " + e.getMessage());
		}
	}
}

public class _07SleepInterruptMethodDemo {

	public static void main(String[] args) {
		MyThreadN t = new MyThreadN();
		t.start();
		t.interrupt();
		System.out.println("End of main Thread");
	}

}
