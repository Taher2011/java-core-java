package _03methodToPrintException;

public class _01PrintStackTraceMethodDemo {

	public static void main(String[] args) {
		System.out.println("main method");
		try {
			int i = 1 / 0;
			System.out.println("Exception occured above");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main method called");

	}

}
