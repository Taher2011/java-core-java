package _08objectTypeCasting;

class Parent {
	void m1() {
		System.out.println("Parent");
	}
}

class Child extends Parent {
	void m2() {
		System.out.println("Child");
	}
}

public class _04TypeCastingDemo {

	public static void main(String[] args) {
		Child c = new Child();

		c.m1();

		c.m2();

		((Parent) c).m1(); // Parent p = new Child();

		// ((Parent) c).m2(); // compile time error //P p = new C(); p.m2();
	}

}
