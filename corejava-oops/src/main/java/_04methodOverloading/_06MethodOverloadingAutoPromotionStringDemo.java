package _04methodOverloading;

/* In method overloading method signatures will be checked,
 * method name and method arguments are part of method signature
 */
public class _06MethodOverloadingAutoPromotionStringDemo {

	public void m1(String s) {
		System.out.println("String");
	}

	public void m1(StringBuffer sb) {
		System.out.println("StringBuffer");
	}

	public static void main(String[] args) {
		_06MethodOverloadingAutoPromotionStringDemo demo = new _06MethodOverloadingAutoPromotionStringDemo();
		
		demo.m1("Ali"); //String
		demo.m1(new StringBuffer()); //StringBuffer
		//demo.m1(null);  //ambiguous error

	}

}
