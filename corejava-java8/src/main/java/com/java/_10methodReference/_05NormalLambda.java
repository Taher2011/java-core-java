package com.java._10methodReference;

interface Calculate {

	int add(int a, int b);

}

public class _05NormalLambda {

	public static void main(String[] args) {

		Runnable r = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName());
			}
		};

		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
		}

		Calculate c = (a, b) -> {
			int d = a + b;
			return d;
		};
		System.out.println(c.add(2, 4));

	}

}
