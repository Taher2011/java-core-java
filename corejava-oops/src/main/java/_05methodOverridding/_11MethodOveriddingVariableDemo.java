package _05methodOverridding;

class Parent10 {
	int a = 10;
	static int b = 20;
}

class Child10 extends Parent10 {
	int a = 30;
	static int b = 40;
}

public class _11MethodOveriddingVariableDemo {

	public static void main(String[] args) {
		Parent10 p = new Parent10();
		Child10 c = new Child10();
		Parent10 pc = new Child10();

		System.out.println(p.a);
		System.out.println(p.b);

		System.out.println();

		System.out.println(c.a);
		System.out.println(c.b);

		System.out.println();

		System.out.println(pc.a);
		System.out.println(pc.b);

	}

}
