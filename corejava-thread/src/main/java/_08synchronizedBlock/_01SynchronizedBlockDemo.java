package _08synchronizedBlock;

class Display {

	public void wish(String name) {
		;
		;
		;
		;
		;
		;// /10k lines of code
		synchronized (this) {
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
		;
		;
		;
		;
		;
		;// /10k lines of code
	}
}

class MyThread extends Thread {

	public Display display;
	public String name;

	public MyThread(Display display, String name) {
		super();
		this.display = display;
		this.name = name;
	}

	public void run() {
		display.wish(name);
	}
}

public class _01SynchronizedBlockDemo {

	public static void main(String[] args) {
		Display display = new Display();
		MyThread t1 = new MyThread(display, "Indore");
		MyThread t2 = new MyThread(display, "Hyderabad");
		t1.start();
		t2.start();
	}
}
