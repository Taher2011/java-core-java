package _04methodOverloading;

/* In method overloading method signatures will be checked,
 * method name and method arguments are part of method signature
 */

public class _05MethodOverloadingAutoPromotionObjectDemo {

	public void m1(String s) {
		System.out.println("String");
	}

	public void m1(Object o) {
		System.out.println("Object");
	}

	public static void main(String[] args) {
		_05MethodOverloadingAutoPromotionObjectDemo demo = new _05MethodOverloadingAutoPromotionObjectDemo();

		demo.m1(new Object()); // Object
		demo.m1("String"); // String
		demo.m1(null); // String coz compiler will always give precedence for
						// child type argument while resolving overloaded
						// methods

	}
}
