package _01innerClasses;

public class _05AccessingInnerClassFromInstanceAreaOfOuterClass {

	class Inner4 {
		public void m1() {
			System.out.println("Inner class m1 method");
		}
	}

	public void m2() {
		System.out.println("Outer class m2 method");
		Inner4 inner = new Inner4();
		inner.m1();
	}

	public static void main(String[] args) {
		_05AccessingInnerClassFromInstanceAreaOfOuterClass outer = new _05AccessingInnerClassFromInstanceAreaOfOuterClass();
		outer.m2();
	}

}
