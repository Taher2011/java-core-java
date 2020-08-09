package com.java.staticMethods;

interface Subtract {

	int c = 10;

	public static void minus(int a, int b) {
		System.out.println("minus is " + (a - b));
	}
}

class SubtractImpl implements Subtract {

	public static void minus(int a, int b) {
		System.out.println("subtraction is " + (a - b));
	}

	@SuppressWarnings("static-access")
	void minusOfNumber() {
		Subtract.minus(15, 7); // this is the only way to call static method of interface
		SubtractImpl s = new SubtractImpl();
		s.minus(25, 7);
		SubtractImpl.minus(15, 7);
		System.out.println(s.c);
	}
}

public class _02StaticMethodExample {

	public static void main(String[] args) {
		SubtractImpl s = new SubtractImpl();
		s.minusOfNumber();
	}
}
