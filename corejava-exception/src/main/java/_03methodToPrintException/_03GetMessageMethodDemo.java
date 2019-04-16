package _03methodToPrintException;

/*
 * Description of Exception
 */

public class _03GetMessageMethodDemo {

	public static void main(String[] args) {
		System.out.println("main method");
		try {
			int i = 1 / 0;
			System.out.println("Exception occured above");
		} catch (ArithmeticException e) {
			System.out.println("Exception occured due to " + e.getMessage());
		}
		System.out.println("main method called");

	}

}
