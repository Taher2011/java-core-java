package _06threadMethods;

class MyThreadK extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("exception because " + e.getMessage());
			}
		}
	}
}

public class _03JoinMethodCase2Demo {

	public static void main(String[] args) throws InterruptedException {
		MyThreadK t = new MyThreadK();
		t.start();
		t.join(1000);
		//t.interrupt();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}

	}

}
