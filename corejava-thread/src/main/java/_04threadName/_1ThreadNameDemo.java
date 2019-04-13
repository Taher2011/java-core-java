package _04threadName;

class MyThread extends Thread {

	public void run() {
		System.out.println("run method called by " + Thread.currentThread().getName());
	}
}

public class _1ThreadNameDemo {

	public static void main(String[] args) {
		
		System.out.println("main method called by " + Thread.currentThread().getName()); // name of main thread
		Thread.currentThread().setName("MainThread");// changing name of main thread
		System.out.println(Thread.currentThread().getName()); // name of main thread

		System.out.println();

		MyThread t = new MyThread();
		System.out.println(t.getName()); // name of child thread
		t.setName("ChildThread");// changing name of child thread
		System.out.println(t.getName());// changing name of child thread

		System.out.println();

		t.start();
		System.out.println("main method called by " + Thread.currentThread().getName());

	}

}
