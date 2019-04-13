package _05threadpriorities;

class MyThread extends Thread {
	
}

public class _1ThreadPriorityDemo {

	public static void main(String[] args) {
		System.out.println("Priority of main thread is " + Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10); // R.E. java.lang.IllegalArgumentException if we set priority more than 10 or less than 1
		MyThread t = new MyThread();
		System.out.println("Priority of child thread is " + t.getPriority());
		t.setPriority(4);
		System.out.println("Priority of main thread is " + Thread.currentThread().getPriority());
		System.out.println("Priority of child thread is " + t.getPriority());
		
		
	}

}
