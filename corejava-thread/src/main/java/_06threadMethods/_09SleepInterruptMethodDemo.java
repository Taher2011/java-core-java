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

In below program child thread won't enter into sleeping state then interrupt call at line 31
will never interrupt child thread. 
*/

class MyThreadN extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Lazy Thread");
		}
	}
}

public class _09SleepInterruptMethodDemo {

	public static void main(String[] args) {
		MyThreadN t = new MyThreadN();
		t.start();
		t.interrupt();
		System.out.println("End of main Thread");
	}

}
