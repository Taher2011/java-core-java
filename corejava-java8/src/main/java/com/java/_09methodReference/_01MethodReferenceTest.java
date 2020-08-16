package com.java._09methodReference;

class Test {

	public static void m1() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread");
		}
	}
}

//Method reference is alternative to Lambda reference

public class _01MethodReferenceTest {

	public static void main(String[] args) {
		Runnable r = Test::m1;// double colon operator,,,// syntax to call static method
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread");
		}
	}

}
