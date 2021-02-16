package com.java._10methodReference;

class Add {

	public int add(int a, int b) {
		int c = a + b + 20;
		return c;
	}
}

public class _06NormalMethodRef {

	public static void runCustom() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}

	public int add(int a, int b) {
		int c = a + b + 10;
		return c;
	}

	public static void main(String[] args) {
		Runnable r = _06NormalMethodRef::runCustom;
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
		}

		_06NormalMethodRef n = new _06NormalMethodRef();

		Calculate c = n::add;
		System.out.println(c.add(2, 4));

		Add a = new Add();
		Calculate c1 = a::add;
		System.out.println(c1.add(2, 4));
	}

}
