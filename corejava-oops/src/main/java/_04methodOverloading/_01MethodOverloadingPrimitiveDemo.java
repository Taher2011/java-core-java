package _04methodOverloading;

/* In method overloading method signatures will be checked,
 * method name and method arguments are part of method signature
 */

public class _01MethodOverloadingPrimitiveDemo {

	public void m1(int i) {
		System.out.println("int");
	}

	public void m1(short s) {
		System.out.println("short");
	}

	public void m1(double d) {
		System.out.println("double");
	}

	public static void main(String[] args) {
		_01MethodOverloadingPrimitiveDemo demo = new _01MethodOverloadingPrimitiveDemo();
		demo.m1(10);
		demo.m1(10.0);
	}

}
