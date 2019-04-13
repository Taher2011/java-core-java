package _02tryCatchExceptionHandling;

public class _02TryCatchAbnormalTerminationDemo {

	public static void doMoreStuff1() {
		System.out.println("doMoreStuff1 method");
		try {
			int i = 1 / 0;
			System.out.println("Exception occured above");
		} catch (Exception e) {
			System.out.println("Exception caught in catch block");
		}
		String s = null;
		s.toString();
		System.out.println("doMoreStuff1 method called");
	}

	public static void doStuff1() {
		System.out.println("doStuff1 method calling doMoreStuff1 method");
		doMoreStuff1();
		System.out.println("doStuff1 called method");
	}

	public static void main(String[] args) {
		System.out.println("main method calling doStuff1 method");
		doStuff1();
		System.out.println("main called method");
	}

}
