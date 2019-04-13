package _06threadMethods;

class MyThreadJ extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class _02JoinMethodCase1Demo {

	public static void main(String[] args) throws InterruptedException {
		MyThreadJ t = new MyThreadJ();
		t.start();
		t.join();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread");
		}

	}

}
