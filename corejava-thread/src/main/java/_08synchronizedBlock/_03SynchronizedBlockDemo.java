package _08synchronizedBlock;

class Display2 {

	public void wish(String name) {
		;
		;
		;
		;
		;
		;// /1ok lines of code
		synchronized (this) { // object level lock and other threads with different object can enter into
								// synchronized block
			System.out.println(this.hashCode());
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

public class _03SynchronizedBlockDemo {

	public static void main(String[] args) {
		Display2 display1 = new Display2();
		Display2 display2 = new Display2();
		MyThread2 t1 = new MyThread2(display1, "Indore");
		MyThread2 t2 = new MyThread2(display2, "Hyderabad");
		t1.start();
		t2.start();
	}

}
