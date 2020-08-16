package com.java._09methodReference;

class Pest {

	public void m1() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread");
		}
	}
}

public class _02MethodReferenceTest {

	public static void main(String[] args) {

		Runnable r = new Pest()::m1;// syntax to call instance method
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread");
		}

	}

}
