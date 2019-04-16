package _05throw;

/*
 * programmer is responsible to create exception object explicitly and hand over to jvm.
*/

public class _02ThrowingExplicitlyByProgrammer {

	public static void main(String[] args) {
		throw new ArithmeticException("/ by 0");
	}

}
