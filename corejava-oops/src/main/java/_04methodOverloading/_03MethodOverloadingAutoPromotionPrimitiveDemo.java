package _04methodOverloading;


/* In method overloading method signatures will be checked,
 * method name and method arguments are part of method signature
 */

public class _03MethodOverloadingAutoPromotionPrimitiveDemo {

	public void m1(int i) {
		System.out.println("int");
	}

	public void m1(float f) {
		System.out.println("float");
	}

	public static void main(String[] args) {
		_03MethodOverloadingAutoPromotionPrimitiveDemo demo = new _03MethodOverloadingAutoPromotionPrimitiveDemo();

		byte b = 1;
		short s = 2;

		demo.m1('c'); // int
		demo.m1(b); // int
		demo.m1(s); // int
		demo.m1(10); // int
		demo.m1(20l); // float
		demo.m1(10.2f); // float

	}
}
