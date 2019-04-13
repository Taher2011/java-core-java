package _03boundedTypesInGenerics;

/* If X is interface then as typeParameter we can pass
 * either X type or its implemented classes.
 */

class Deparatment implements Runnable {

	public void run() {

	}

	@Override
	public String toString() {
		return "Deparatment object";
	}

}

class Pest<T extends Runnable> {

	T a;

	public Pest(T a) {
		super();
		this.a = a;
	}

	public void demo() {
		System.out.println(a.getClass().getName());
		System.out.println();
	}
}

public class _03BoundTypesDemo {

	public static void main(String[] args) {
		Pest<Deparatment> t1 = new Pest<Deparatment>(new Deparatment());
		Pest<Runnable> t2 = new Pest<Runnable>(new Deparatment());
		Pest<Thread> t3 = new Pest<Thread>(new Thread());
		t1.demo();
		t2.demo();
		t3.demo();
	}

}
