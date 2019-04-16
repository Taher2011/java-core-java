package _02tryCatchExceptionHandling;

/*
 * If one method terminates abnormally then program termination is abnormal termination.
 * If one method terminates normally then program termination is normal termination.
*/

public class _01TryCatchNormalTerminationDemo {

	public static void doMoreStuff() {
		System.out.println("doMoreStuff method");
		try {
			int i = 1 / 0;
			System.out.println("Exception occured above");
		} catch (Exception e) {
			System.out.println("Exception caught in catch block");
		}
		System.out.println("doMoreStuff method called");
	}

	public static void doStuff() {
		System.out.println("doStuff method calling doMoreStuff method");
		doMoreStuff();
		System.out.println("doStuff called method");
	}

	public static void main(String[] args) {
		System.out.println("main method calling doStuff method");
		doStuff();
		System.out.println("main called method");
	}

}
