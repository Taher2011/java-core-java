package _13constructor;

public class _01ConstructorDemo {

	private static int count;

	{
		count++;
	}

	public _01ConstructorDemo() {
	}

	public _01ConstructorDemo(int i) {
	}

	public _01ConstructorDemo(double d) {
	}

	public static void main(String[] args) {
		_01ConstructorDemo t1 = new _01ConstructorDemo();
		_01ConstructorDemo t2 = new _01ConstructorDemo(5);
		_01ConstructorDemo t3 = new _01ConstructorDemo(10.5);

		System.out.println("No of objects created " + count);
	}

}
