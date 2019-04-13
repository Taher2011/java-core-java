package _08objectTypeCasting;

class A2 {
	static int x = 7;
}

class B2 extends A2 {
	int x = 8;
}

class C2 extends B2 {
	int x = 9;
}

public class _07TypeCastingForInstanceVariableDemo {

	public static void main(String[] args) {
		C2 c = new C2();

		System.out.println(c.x);

		System.out.println(((B2) c).x); // B2 b = new C2(); b.x();

		System.out.println(((A2) ((B2) c)).x); // A2 a = new C2(); a.x();
	}
}
