package _01innerClasses;

public class _04AccessingInnerClassFromStaticAreaOfOuterClass {

	class Inner3 {
		public void m1() {
			System.out.println("Inner class m1 method");
		}
	}
	public static void main(String[] args) {
		_04AccessingInnerClassFromStaticAreaOfOuterClass outer = new _04AccessingInnerClassFromStaticAreaOfOuterClass();
		_04AccessingInnerClassFromStaticAreaOfOuterClass.Inner3 inner = outer.new Inner3();
		inner.m1();
	}

}
