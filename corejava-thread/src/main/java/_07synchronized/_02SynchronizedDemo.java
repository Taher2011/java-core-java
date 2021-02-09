package _07synchronized;

class Display1 {

	public synchronized void wish(String name) {
		System.out.println(this.hashCode());
		for (int i = 0; i < 5; i++) {
			System.out.print("GM ");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println("Interrupted");
			}
			System.out.println(name);
		}
	}
}

class MyThread1 extends Thread {

	public Display1 display;
	public String name;

	public MyThread1(Display1 display, String name) {
		super();
		this.display = display;
		this.name = name;
	}

	public void run() {
		display.wish(name);
	}
}

public class _02SynchronizedDemo {

	/*
	 * If Multiple threads(t1,t2,t3) are operating on same object(display) then
	 * synchronization is required, in this case we will get regular output
	 */
	public static void main(String[] args) {
		Display1 display = new Display1();
		MyThread1 t1 = new MyThread1(display, "Indore");
		MyThread1 t2 = new MyThread1(display, "Hyderabad");
		MyThread1 t3 = new MyThread1(display, "Pune");
		t1.start();
		t2.start();
		t3.start();

	}

}
