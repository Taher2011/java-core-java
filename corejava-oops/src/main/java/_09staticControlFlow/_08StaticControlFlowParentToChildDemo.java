package _09staticControlFlow;

//Point 1, Identification of static members from Parent to Child

// Point 2, Execution of static variable assignments and execution of
// static blocks from Parent to Child

// Point 3, Execution of main method only Child class

class Base {

	static int i = 10;

	static {
		m1();
		System.out.println("Base Static Block");
	}

	public static void main(String[] args) {
		m1();
		System.out.println("main method");
	}

	public static void m1() {
		System.out.println("j is " + j);
	}

	static int j = 20;
}

class Derived extends Base {

	static int x = 100;

	static {
		m2();
		System.out.println("Derived First Static Block");
	}

	public static void main(String[] args) {
		m2();
		System.out.println("Derived main method");
	}

	public static void m2() {
		System.out.println("y is " + y);
	}

	static {
		System.out.println("Derived Second Static Block");
	}

	static int y = 200;
}

public class _08StaticControlFlowParentToChildDemo {

	public static void main(String[] args) {

	}

}
