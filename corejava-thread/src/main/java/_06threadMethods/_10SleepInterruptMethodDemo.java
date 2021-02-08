package _06threadMethods;

/*
A thread can interrupt another thread by calling interrupt() of Thread class.
If the target thread is not in sleeping state or waiting state, then there is
no impact of interrupt call immediately. Interrupt call be waited until target
thread entered into sleeping or waiting state.
If target thread entered into sleeping or waiting state, then immediately 
interrupt call will interrupt target thread.
If target thread never entered into sleeping or waiting state then there is no impact
of interrupt call.

In below program interrupt() waited until child thread completes for loop 10 times. 
*/

class MyThreadW extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Lazy Thread");
		}
		System.out.println("enter into sleeping state");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
	}
}

public class _10SleepInterruptMethodDemo {

	public static void main(String[] args) {
		MyThreadW t = new MyThreadW();
		t.start();
		t.interrupt();
		System.out.println("End of main Thread");
	}

}
