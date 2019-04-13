package _06interfaceInsideInterface;

interface Outer {

	public void m1();

	interface Inner {
		public void m2();
	}

}

class Test1 implements Outer {

	@Override
	public void m1() {
		System.out.println("Outer Interface method implementation");

	}

}

class Test2 implements Outer.Inner {

	@Override
	public void m2() {
		System.out.println("Inner Interface method implementation");

	}

}

public class TestDemo {
	public static void main(String[] args) {
		Test1 test1 = new Test1();
		test1.m1();
		
		Test2 test2 = new Test2();
		test2.m2();
	}
}