package _01innerClasses;

import _01innerClasses.Outer6.Inner6;

class Outer6 {

	class Inner6 {
		public void m1() {
			System.out.println("Inner class m1 method");
		}
	}
}

public class _06AccessingInnerClassFromOutsideOfOuterClass {

	public void m2() {
		Outer6 outer = new Outer6();
		Outer6.Inner6 inner = outer.new Inner6();
		inner.m1();

	}

	public static void main(String[] args) {
		Outer6 outer = new Outer6();
		Outer6.Inner6 inner = outer.new Inner6();
		inner.m1();
	}

}
