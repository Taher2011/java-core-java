package _13constructor;

import java.io.IOException;

class A {

	int a;

	A() throws IOException {
		this(5);
	}

	public A(int a) {
		super();
		this.a = a;
	}

}

class B extends A {

	public B(int a) throws Exception {
		this.a = a;
	}
}

public class _02ConstructorDemo {

	public static void main(String[] args) {

	}

}
