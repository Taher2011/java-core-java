package _08synchronizedBlock;

class Display1 {

	public void wish(String name) {
		;
		;
		;
		;
		;
		;// /1ok lines of code
		synchronized (Display1.class) { // class level lock and other threads with same or different object cannot enter
										// into synchronized block
			System.out.println(Display1.class.hashCode() + " " + this.hashCode());
			System.out.println(Thread.currentThread().getName() + " entered into synchornized block");
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
		;// /1ok lines of code
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

public class _02SynchronizedBlockDemo {

	public static void main(String[] args) {
		Display1 display1 = new Display1();
		Display1 display2 = new Display1();
		MyThread1 t1 = new MyThread1(display1, "Indore");
		MyThread1 t2 = new MyThread1(display2, "Hyderabad");
		t1.start();
		t2.start();
	}

}
