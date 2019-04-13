package _02methodLocalInnerClasses;

public class _03MethodLocalInnerClassInsideStaticMethodDemo {

	int x = 10;
	static int y = 20;
	
	public static void m1() {

		class Inner3 {
			public void m2() {
				//System.out.println(x + y); //Cannot access instance variable from static context
			}
		}
		
		Inner3 inner = new Inner3();
		inner.m2();
	}

	public static void main(String[] args) {
		_03MethodLocalInnerClassInsideStaticMethodDemo outer = new _03MethodLocalInnerClassInsideStaticMethodDemo();
		outer.m1();
	}

}
