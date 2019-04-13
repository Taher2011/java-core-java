package _03boundedTypesInGenerics;

class Rest<T, X, Y> {

	T a;
	X b;
	Y c;

	public Rest(T a, X b, Y c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void demo() {
		System.out.println(a.getClass().getName());
		System.out.println(b.getClass().getName());
		System.out.println(c.getClass().getName());
		System.out.println();
	}
}

public class _04BoundTypesDemo {

	public static void main(String[] args) {
		Rest<Integer, Float, Double> r = new Rest<Integer, Float, Double>(10,
				12.0f, 32.0);
		r.demo();
	}

}
