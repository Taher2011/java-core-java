package _01innerClasses;

class A {

	class B {

		class C {
			public void m1() {
				System.out.println("Inner most class method");
			}
		}
	}
}

public class _09NestingOfInnerClasses {

	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		A.B.C c = b.new C();
		c.m1();
	}
}
