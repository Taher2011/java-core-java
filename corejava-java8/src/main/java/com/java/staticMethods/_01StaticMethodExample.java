package com.java.staticMethods;

interface Add {

	int c = 10;

	public static void sum(int a, int b) {
		System.out.println("sum is " + (a + b));
	}
}

class AddImpl implements Add {

	@SuppressWarnings("static-access")
	void sumOfNumber() {
		Add.sum(5, 7); // this is the only way to call static method of interface
		AddImpl a = new AddImpl();
		// a.sum(5, 7); //compile time error;
		// AddImpl.sum(5, 7); //compile time error;
		System.out.println(a.c);
	}
}

public class _01StaticMethodExample {

	public static void main(String[] args) {
		AddImpl a = new AddImpl();
		a.sumOfNumber();
	}
}
