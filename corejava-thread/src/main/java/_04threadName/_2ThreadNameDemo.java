package _04threadName;

class MyThreadN extends Thread {

	public void run() {
		System.out.println("run method called by " + Thread.currentThread().getName());
	}
}

public class _2ThreadNameDemo {

	public static void main(String[] args) {
		System.out.println("main method called by " + Thread.currentThread().getName());
		MyThreadN t = new MyThreadN();
		t.start();
		System.out.println("main method called by " + Thread.currentThread().getName());
	}

}
