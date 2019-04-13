package _06threadMethods;

class MyThreadM extends Thread {

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

public class _05JoinMethodCase4Demo {

	public static void main(String[] args) throws InterruptedException {
		MyThreadM.mainThreadObj = Thread.currentThread();
		MyThreadM t = new MyThreadM();
		t.start();
		t.join();
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
