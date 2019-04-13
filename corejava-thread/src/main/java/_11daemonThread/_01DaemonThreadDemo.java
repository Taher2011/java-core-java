package _11daemonThread;

class MyThread extends Thread {
	
}

public class _01DaemonThreadDemo {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().isDaemon());
		
		// Thread.currentThread().setDaemon(false); //Runtime exception "java.lang.IllegalThreadStateException"
		
		MyThread t = new MyThread();
		
		System.out.println(t.isDaemon());
		
		t.setDaemon(true);
		
		System.out.println(t.isDaemon());
		
		t.start();
		
		System.out.println(t.isDaemon());
		
		t.setDaemon(false);
	}

}
