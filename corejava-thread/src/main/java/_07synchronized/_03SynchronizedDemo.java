package _07synchronized;

class Display2 {

	public synchronized void wish(String name) {
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

class MyThread2 extends Thread {

	public Display2 display;
	public String name;

	public MyThread2(Display2 display, String name) {
		super();
		this.display = display;
		this.name = name;
	}

	public void run() {
		display.wish(name);
	}
}

public class _03SynchronizedDemo {

	/*
	 * If Multiple threads(t1,t2) are operating on multiple
	 * objects(display1,display2) then synchronization is'nt required, in this
	 * case we will get irregular output even though method is synchronized.
	 */
	public static void main(String[] args) {
		Display2 display1 = new Display2();
		Display2 display2 = new Display2();
		MyThread2 t1 = new MyThread2(display1, "Indore");
		MyThread2 t2 = new MyThread2(display2, "Hyderabad");
		t1.start();
		t2.start();

	}

}
