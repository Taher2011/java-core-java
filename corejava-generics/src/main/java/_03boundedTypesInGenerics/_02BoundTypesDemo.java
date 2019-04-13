package _03boundedTypesInGenerics;

/* If X is class then as typeParameter we can pass
 * either X type or its child classes.
 */

class Test<T extends Number> {

	T a, b;

	public Test(T a, T b) {
		super();
		this.a = a;
		this.b = b;
	}

	public void demo() {
		System.out.println(a.getClass().getName());
		System.out.println(b.getClass().getName());
		System.out.println();
	}
}

public class _02BoundTypesDemo {

	public static void main(String[] args) {
		Test<Integer> t1 = new Test<Integer>(1, 2);
		Test<Float> t2 = new Test<Float>(3.3f, 8.7f);
		Test<Number> t3 = new Test<Number>(1, 8.7);
		t1.demo();
		t2.demo();
		t3.demo();
	}

}
