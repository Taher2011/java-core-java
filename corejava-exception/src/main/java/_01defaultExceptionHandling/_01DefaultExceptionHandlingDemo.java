package _01defaultExceptionHandling;

/*
 * Default Exception handler mechanism, inside any method if any exception occurs then that method in which it raised
 * is responsible to create exception object by including following information.
 * Name of exception, Description of exception, Location at which exception occurs i.e stack trace.
 * After creating exception object method hands over that object to jvm. JVM will check whetehr the method contains any
 * exception handling code or not, if not then jvm terminates that method abnormally and removes corresponding entry from stack.
 * Then jvm identifies caller method and checks whether caller method contains any exception handlin code or not, if not then jvm
 * terminates caller method abnormally and removes corresponding entry from stack. This process continues until main method.
 * If main method also doesn't contain handling code, then jvm terminates main method also and removes corresponding entry from stack.
 * Then jvm hands over responsibility of exception handling to default exception handler which is part of jvm.
 * Default exception handler prints exception information in below format and terminates program abnormally
 * Exception in thread "xxx" Name of exception: Description
 * 											Stacktrace.
 * 
 * */

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
