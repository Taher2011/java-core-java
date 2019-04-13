package _03inheritance;

class A {
	public void testA() {
		System.out.println("A");
	}
}

class B extends A {
	public void testB() {
		System.out.println("B");
	}
}


/**
 * Advantage of is Inheritance Code reusability
 *
 */
public class _01ClassInheritanceDemo {

	public static void main(String[] args) {
		A a = new A();
		a.testA();
		// a.testB();

		B b = new B();
		b.testA();
		b.testB();

		A ab = new B();
		ab.testA();
		// ab.testB();

		// B ba = new A();
	}

}
