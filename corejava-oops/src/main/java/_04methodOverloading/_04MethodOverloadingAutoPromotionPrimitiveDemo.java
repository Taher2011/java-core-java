package _04methodOverloading;


/* In method overloading method signatures will be checked,
 * method name and method arguments are part of method signature
 */

public class _04MethodOverloadingAutoPromotionPrimitiveDemo {

	public void m1(int i, float f) {
		System.out.println("int float");
	}

	public void m1(float f, int i) {
		System.out.println("float int");
	}

	public static void main(String[] args) {
		_04MethodOverloadingAutoPromotionPrimitiveDemo demo = new _04MethodOverloadingAutoPromotionPrimitiveDemo();

		demo.m1(10, 10.5f);//int float
		demo.m1(10.5f, 10);//float int
		//demo.m1(10, 10); //ambiguous error
		//demo.m1(10, 10.2); //not applicable for the arguments (int, double)

	}
}
