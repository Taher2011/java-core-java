package _03methodToPrintException;

public class _02ToStringMethodDemo {

	public static void main(String[] args) {
		System.out.println("main method");
		try {
			int i = 1 / 0;
			System.out.println("Exception occured above");
		} catch (Exception e) {
			System.out.println("Exception occured due to " + e.toString()); // System.out.println(e);
		}
		System.out.println("main method called");

	}

}
