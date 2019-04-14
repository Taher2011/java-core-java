package _06threadMethods;

class MyThreadL extends Thread {

	static Thread mainThreadObj;

	public void run() {
		try {
			mainThreadObj.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
}

public class _04JoinMethodCase3Demo {

	public static void main(String[] args) {
		MyThreadL t = new MyThreadL();
		MyThreadL.mainThreadObj = Thread.currentThread();
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
