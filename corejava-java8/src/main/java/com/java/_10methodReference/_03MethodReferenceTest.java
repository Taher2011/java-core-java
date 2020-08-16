package com.java._10methodReference;

class Nest {

	public static int m1() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread");
		}
		return 0;
	}
}

public class _03MethodReferenceTest {

	public static void main(String[] args) {

		Runnable r = Nest::m1; // compulsory method argument must be same means like run() don't take any
								// argument so m1() also should not have any argument else we will get compile
								// error. We should not worry about return type and modifiers in case of method
								// reference only to look for
								// argument.
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread");
		}

	}

}
