package _01innerClasses;

class Outer6 {

	class Inner6 {
		public void m1() {
			System.out.println("Inner class m1 method");
		}
	}
}

public class _06AccessingInnerClassFromOutsideOfOuterClass {

	public static void main(String[] args) {
		Outer6 outer = new Outer6();
		Outer6.Inner6 inner = outer.new Inner6();
		inner.m1();
	}

}
