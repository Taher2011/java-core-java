package _07synchronized;

class Display {

	public void wish(String name) {
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

public class _01NonSynchronizedDemo {

	public static void main(String[] args) {
		Display display = new Display();
		MyThread t1 = new MyThread(display, "Indore");
		MyThread t2 = new MyThread(display, "Hyderabad");
		MyThread t3 = new MyThread(display, "Pune");
		t1.start();
		t2.start();
		t3.start();
	}

}
