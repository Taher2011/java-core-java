package _01innerClasses;

public class _07InsideInnerClassCanAccessStatic {

	int x = 10;
	static int y = 20;

	class Inner7 {
		public void m1() {
			System.out.println(x);
			System.out.println(y);
		}
	}

	public static void main(String[] args) {
		_07InsideInnerClassCanAccessStatic outer = new _07InsideInnerClassCanAccessStatic();
		_07InsideInnerClassCanAccessStatic.Inner7 inner = outer.new Inner7();
		inner.m1();
	}

}
