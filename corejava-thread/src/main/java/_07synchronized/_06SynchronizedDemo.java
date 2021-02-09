package _07synchronized;

/*
 * While thread executing synchronized method on given object, the remaining threads are not allowed
 * to execute same method or any other synchronized methods simultaneously on the same object, 
 * but remaining threads are allowed to execute non-synchronized methods simultaneously.
*/

class Display4 {

	public synchronized void displayN() {
		System.out.println(this.hashCode());
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
		System.out.println(this.hashCode());
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

public class _06SynchronizedDemo {

	public static void main(String[] args) {
		Display4 display = new Display4();
		MyThread4 t1 = new MyThread4(display);
		MyThread5 t2 = new MyThread5(display);
		t1.start();
		t2.start();
	}

}
