package _07synchronized;

class Display4 {

	public synchronized void displayN() {
		for (int i = 0; i < 5; i++) {
			System.out.print(i + " ");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println("Interrupted");
			}
		}
	}

	public void displayC() { // public synchronized void displayC()
		for (int i = 65; i < 70; i++) {
			System.out.print((char) i + " ");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println("Interrupted");
			}
		}
	}
}

class MyThread4 extends Thread {

	public Display4 display;

	public MyThread4(Display4 display) {
		super();
		this.display = display;
	}

	public synchronized void run() {
		display.displayN();
	}
}

class MyThread5 extends Thread {

	public Display4 display;

	public MyThread5(Display4 display) {
		super();
		this.display = display;
	}

	public void run() {
		display.displayC();
	}
}

public class _05SynchronizedDemo {

	public static void main(String[] args) {
		Display4 display = new Display4();
		MyThread4 t1 = new MyThread4(display);
		MyThread5 t2 = new MyThread5(display);
		t1.start();
		t2.start();
	}

}
