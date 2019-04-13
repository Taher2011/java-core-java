package _07synchronized;

class Display3 {

	public static synchronized void wish(String name) {
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

class MyThread3 extends Thread {

	public Display3 display;
	public String name;

	public MyThread3(Display3 display, String name) {
		super();
		this.display = display;
		this.name = name;
	}

	public void run() {
		display.wish(name);
	}
}

public class _04SynchronizedDemo {

	/*
	 * If Multiple threads(t1,t2) are operating on multiple
	 * objects(display1,display2) for static synchronization method, in this
	 * case we will get regular output, because thread acquired class level
	 * lock
	 */
	public static void main(String[] args) {
		Display3 display1 = new Display3();
		Display3 display2 = new Display3();
		MyThread3 t1 = new MyThread3(display1, "Indore");
		MyThread3 t2 = new MyThread3(display2, "Hyderabad");
		t1.start();
		t2.start();

	}

}
