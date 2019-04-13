package _02methodLocalInnerClasses;

public class _01MethodLocalInnerClassDemo {

	public void m1() {

		class Inner1 {
			public void sum(int x, int y) {
				System.out.println("sum is " + (x + y));
			}
		}
		
		Inner1 inner = new Inner1();
		inner.sum(10, 20);
		;;;;
		inner.sum(100, 200);
		;;;;
		inner.sum(1000, 2000);
	}

	public static void main(String[] args) {
		_01MethodLocalInnerClassDemo outer = new _01MethodLocalInnerClassDemo();
		outer.m1();
	}

}
