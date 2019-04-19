package _02methodLocalInnerClasses;

public class _04MethodLocalInnerClassCantAccessLocVarDemo {

	public void m1() {

		int x = 10;
		final int y = 10;
		
		class Inner4 {

			public void m2() {
				// System.out.println(x); //Cannot access local variable of method in
				// which class is defined, until the variable is final
				System.out.println(y);
			}
		}

		Inner4 inner = new Inner4();
		inner.m2();
	}

	public static void main(String[] args) {
		_04MethodLocalInnerClassCantAccessLocVarDemo outer = new _04MethodLocalInnerClassCantAccessLocVarDemo();
		outer.m1();
	}

}
