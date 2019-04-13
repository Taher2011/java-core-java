package _15abstractclass;

abstract class A {

	int a = 10;
	static int b = 11;

	abstract public void test();

}

class B extends A {

	int a = 12;
	static int b = 13;

	public void test() {

	}

}

public class _03AbstractClassConstructorDemo {

	public static void main(String[] args) {
		A ab = new B();
		System.out.println(ab.a);
		System.out.println(ab.b);
	}

}
