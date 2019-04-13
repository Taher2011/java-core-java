package _08objectTypeCasting;

class Base1 {
}

class Der1 extends Base1 {
}

class Der2 extends Base1 {
}

class Base2 {
}

class Der3 extends Base2 {
}

class Der4 extends Base2 {
}

public class _03TypeCastingDemo {

	public static void main(String[] args) {
		Object o = new String("S");
		Object o1 = (String) o;
		System.out.println("valid");

		System.out.println();

		Base2 b = new Der4();

		// 1)
		Object o2 = (Base2) b;
		System.out.println("valid");

		// 2)
		// Object o3 = (Base1)b; // Compile time error Inconvertible type

		// 3)
		// Object o3 = (Der3)b; // Run time exception ClassCast exception

		// 4)
		// Base2 b2 = (Base1)b; // Compile time error Inconvertible type

		// 5
		// Base1 b3 = (Der4)b; // Compile time error Incompatible type

	}

}
