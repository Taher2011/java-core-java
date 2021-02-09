package _07synchronized;

class Display6 {

	public static synchronized void displayC() {
		System.out.print(Display3.class.hashCode() + " ");
		for (int i = 65; i < 70; i++) {
			System.out.print((char) i + " ");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println("Interrupted");
			}
		}
	}

	public synchronized void displayN() {
		System.out.print(Display3.class.hashCode() + " ");
		for (int i = 0; i < 5; i++) {
			System.out.print(i + " ");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println("Interrupted");
			}
		}
	}

}

class MyThread10 extends Thread {

	public Display6 display;

	public MyThread10(Display6 display) {
		super();
		this.display = display;
	}

	public void run() {
		Display6.displayC();
	}
}

class MyThread11 extends Thread {

	public Display6 display;

	public MyThread11(Display6 display) {
		super();
		this.display = display;
	}

	public void run() {
		display.displayN();
	}
}

public class _05StaticSynchronizedDemo {

	/*
	 * If Multiple threads(t1,t2) are operating on multiple
	 * objects(display1,display2) for static synchronization method, in this case we
	 * will get regular output, because thread acquired class level lock
	 */
	public static void main(String[] args) {
		Display6 display1 = new Display6();
		Display6 display2 = new Display6();
		MyThread10 t1 = new MyThread10(display1);
		MyThread11 t2 = new MyThread11(display2);
		t1.start();
		t2.start();

	}

}
