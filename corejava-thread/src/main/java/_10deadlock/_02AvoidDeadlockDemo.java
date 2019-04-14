package _10deadlock;

class A1 {

	public synchronized void d1(B1 b) {
		System.out
				.println("Thread 1 starts execution of d1() method and Thread 1 is "
						+ "having lock of object 'a'");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out
				.println("Thread 1 trying to call class B1's last() method and it is synchronized so it need lock of object 'b1' but lock of"
						+ " object 'b1' is not accquired by Thread 2");
		;
		b.last();
	}

	public synchronized void last() {
		System.out.println("Inside A's last() method");
	}
}

class B1 {

	public synchronized void d1(A1 a) {
		System.out
				.println("Thread 2 starts execution of d1() method and Thread 2 is "
						+ "having lock of object 'b'");
		try {
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out
				.println("Thread 2 trying to call class A1's last() method and it is synchronized so it need lock of object 'a' but lock of"
						+ " object 'a1' is not accquired by Thread 1");
		;
		a.last();
	}

	public synchronized void last() {
		System.out.println("Inside B's last() method");
	}
}

public class _02AvoidDeadlockDemo extends Thread {

	A1 a = new A1();
	B1 b = new B1();
	
	A1 a1 = new A1();
	B1 b1 = new B1();
	
	public void m1() {
		this.start();
		a.d1(b1); // This line executed by main thread
	}

	public void run() {
		b.d1(a1); // This line executed by child thread
	}

	public static void main(String[] args) {
		_02AvoidDeadlockDemo d = new _02AvoidDeadlockDemo();
		d.m1();
	}

}
