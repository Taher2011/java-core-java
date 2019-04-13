package _08objectTypeCasting;

class A {
	void m1() {
		System.out.println("A");
	}
}

class B extends A {
	void m1() {
		System.out.println("B");
	}
}

class C extends B {
	void m1() {
		System.out.println("C");
	}
}

public class _05TypeCastingForMethodOverridingDemo {

	public static void main(String[] args) {
		C c = new C();
		
		c.m1();
		
		((B) c).m1(); // B b = new C(); b.m1();
		
		((A)((B)c)).m1(); // A a = new C(); a.m1();

	}

}
