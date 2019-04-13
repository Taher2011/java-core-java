package _01defaultExceptionHandling;

public class _01DefaultExceptionHandlingDemo {

	public static void doMoreStuff() {
		System.out.println("doMoreStuff method");
		int i = 1 / 0;
		System.out.println("doMoreStuff method called");
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
