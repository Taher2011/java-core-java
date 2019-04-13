package _13constructor;

class C {

	int a;
	int b;

	public C() {
		super();
	}

	public C(int a) {
		super();
		this.a = a;
	}

	public C(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

}

class D extends C {

}

public class _03ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
