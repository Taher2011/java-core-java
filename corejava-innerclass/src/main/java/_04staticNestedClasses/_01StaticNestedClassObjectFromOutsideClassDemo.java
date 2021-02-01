package _04staticNestedClasses;

import _04staticNestedClasses.Outer.Inner;

class Outer {

	static class Inner {
		public void m1() {
			System.out.println("Nested Static class method");
		}
	}
}

public class _01StaticNestedClassObjectFromOutsideClassDemo {

	public static void main(String[] args) {
		Outer.Inner i = new Outer.Inner();
		i.m1();
		Inner i1 = new Inner();
		i1.m1();
	}

}
