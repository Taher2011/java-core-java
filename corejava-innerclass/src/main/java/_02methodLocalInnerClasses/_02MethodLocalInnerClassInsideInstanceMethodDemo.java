package _02methodLocalInnerClasses;

public class _02MethodLocalInnerClassInsideInstanceMethodDemo {

	int x = 10;
	static int y = 20;
	
	public void m1() {

		class Inner2 {
			public void m2() {
				System.out.println(x + y);
			}
		}
		
		Inner2 inner = new Inner2();
		inner.m2();
	}

	public static void main(String[] args) {
		_02MethodLocalInnerClassInsideInstanceMethodDemo outer = new _02MethodLocalInnerClassInsideInstanceMethodDemo();
		outer.m1();
	}

}
