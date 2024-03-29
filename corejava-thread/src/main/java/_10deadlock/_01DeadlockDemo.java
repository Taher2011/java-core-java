package _10deadlock;

class A {

	public synchronized void d1(B b) {
		System.out
				.println("Thread 1 starts execution of d1() method and Thread 1 is "
						+ "having lock of object 'a'");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out
				.println("Thread 1 trying to call class B's last() method and it is synchronized so it need lock of object 'b' but lock of"
						+ " object 'b' is at Thread 2");
		;
		b.last(); //new B().last();
	}

	public synchronized void last() {
		System.out.println("Inside A's last() method");
	}
}

class B {

	public synchronized void d1(A a) {
		System.out
				.println("Thread 2 starts execution of d1() method and Thread 2 is "
						+ "having lock of object 'b'");
		try {
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out
				.println("Thread 2 trying to call class A's last() method and it is synchronized so it need lock of object 'a' but lock of"
						+ " object 'a' is at Thread 1");
		;
		a.last(); //new A().last();
	}

	public synchronized void last() {
		System.out.println("Inside B's last() method");
	}
}

public class _01DeadlockDemo extends Thread {

	A a = new A();
	B b = new B();
	
	public void m1() {
		this.start();
		a.d1(b); // This line executed by main thread
	}

	public void run() {
		b.d1(a); // This line executed by child thread
	}

	public static void main(String[] args) {
		_01DeadlockDemo d = new _01DeadlockDemo();
		d.m1();
	}

}
