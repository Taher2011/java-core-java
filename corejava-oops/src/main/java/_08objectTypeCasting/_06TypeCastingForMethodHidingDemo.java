package _08objectTypeCasting;

class A1 {
	static void m1() {
		System.out.println("A");
	}
}

class B1 extends A1 {
	static void m1() {
		System.out.println("B");
	}
}

class C1 extends B1 {
	static void m1() {
		System.out.println("C");
	}
}

public class _06TypeCastingForMethodHidingDemo {

	public static void main(String[] args) {
		C1 c = new C1();

		c.m1();

		((B1) c).m1(); // B1 b = new C1(); b.m1();

		((A1) ((B1) c)).m1(); // A1 a = new C1(); a.m1();

	}

}
