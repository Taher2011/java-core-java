package _05throw;

public class _03ThrowingExceptionManuallyDemo {

	public static void doMoreStuff() {
		System.out.println("doMoreStuff method");
		throw new ArithmeticException("Divide by Zero");
	}

	public static void doStuff() {
		System.out.println("doStuff method calling doMoreStuff method");
		doMoreStuff();
		System.out.println("called doMoreStuff method");
	}

	public static void main(String[] args) {
		System.out.println("main method calling doStuff method");
		doStuff();
		System.out.println("called doStuff method");
	}

}
