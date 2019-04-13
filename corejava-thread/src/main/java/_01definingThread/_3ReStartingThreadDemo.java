package _01definingThread;

class MyThreadM extends Thread {

	public void run() {
		System.out.println("run method called by Child thread " + Thread.currentThread().getName());
	}
}
public class _3ReStartingThreadDemo {

	public static void main(String[] args) {
		MyThreadM t = new MyThreadM();
		t.start();
		System.out.println("main method called by Main thread " + Thread.currentThread().getName());
		t.start(); // R.E. java.lang.IllegalThreadStateException
	}

}
