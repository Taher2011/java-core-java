package _05threadpriorities;

class MyThreadT extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("runs method");
		}
	}
}

public class _2ThreadPriorityDemo {

	public static void main(String[] args) {
		MyThreadT t = new MyThreadT();
		t.setPriority(10);
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("main method");
		}

	}

}
