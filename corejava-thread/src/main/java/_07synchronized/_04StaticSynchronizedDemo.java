package _07synchronized;

class Display3 {

	public static synchronized void displayC() {
		for (int i = 65; i < 70; i++) {
			System.out.print((char) i + " ");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println("Interrupted");
			}
		}
	}

	public static synchronized void displayN() {
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

class MyThread8 extends Thread {

	public Display3 display;

	public MyThread8(Display3 display) {
		super();
		this.display = display;
	}

	public void run() {
		Display3.displayC();
	}
}

class MyThread9 extends Thread {

	public Display3 display;

	public MyThread9(Display3 display) {
		super();
		this.display = display;
	}

	public void run() {
		Display3.displayN();
	}
}

public class _04StaticSynchronizedDemo {

	/*
	 * If Multiple threads(t1,t2) are operating on multiple
	 * objects(display1,display2) for static synchronization method, in this case we
	 * will get regular output, because thread acquired class level lock
	 */
	public static void main(String[] args) {
		Display3 display1 = new Display3();
		Display3 display2 = new Display3();
		MyThread8 t1 = new MyThread8(display1);
		MyThread9 t2 = new MyThread9(display2);
		t1.start();
		t2.start();

	}

}
