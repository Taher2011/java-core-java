package _07synchronized;

/*
 * While thread executing synchronized method on given object, the remaining threads are not allowed
 * to execute same method or any other synchronized methods simultaneously on the same object, 
 * but remaining threads are allowed to execute non-synchronized methods simultaneously.
*/

class Display5 {

	public synchronized void displayN() {
		System.out.print(this.hashCode() + " ");
		for (int i = 0; i < 5; i++) {
			System.out.print(i + " ");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println("Interrupted");
			}
		}
	}

	public synchronized void displayC() {
		System.out.print(this.hashCode() + " ");
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

class MyThread6 extends Thread {

	public Display5 display;

	public MyThread6(Display5 display) {
		super();
		this.display = display;
	}

	public synchronized void run() {
		display.displayN();
	}
}

class MyThread7 extends Thread {

	public Display5 display;

	public MyThread7(Display5 display) {
		super();
		this.display = display;
	}

	public void run() {
		display.displayC();
	}
}

public class _07SynchronizedDemo {

	public static void main(String[] args) {
		Display5 display = new Display5();
		MyThread6 t1 = new MyThread6(display);
		MyThread7 t2 = new MyThread7(display);
		t1.start();
		t2.start();
	}

}
