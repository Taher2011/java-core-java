package _09staticControlFlow;

class ExecutionFlow {
	// Point 1, Identification of static members from top to bottom
	// at line 30, static int i
	// at line 32, static
	// at line 37, public static void main(String[] args)
	// at line 42, public static void m1()
	// at line 47, static
	// at line 51, static int j

	// Point 2, Execution of static variable assignments and execution of static blocks from top to bottom
	// at line 30,  i = 10
	// at line 33, m1()
	// at line 43, System.out.println("i is " + i)
	// at line 44, System.out.println("j is " + j)
	// at line 34, System.out.println("First Static Block");
	// at line 48, System.out.println("Second Static Block");
	// at line 51,  j = 20
	
	// Point 3, Execution of main method
	// at line 38, m1()
	// at line 43, System.out.println("i is " + i)
	// at line 44, System.out.println("j is " + j)
	// at line 39, System.out.println("main method");
}

public class _02StaticControlFlowExecutionDemo {

	static int i = 10;

	static {
		m1();
		System.out.println("First Static Block");
	}

	public static void main(String[] args) {
		m1();
		System.out.println("main method");
	}

	public static void m1() {
		System.out.println("i is " + i);
		System.out.println("j is " + j);
	}

	static {
		System.out.println("Second Static Block");
	}

	static int j = 20;

}
