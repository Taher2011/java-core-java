package com.java._09methodReference;

interface Addition {

	void add(int a, int b);
}

class Summation {

	public static int sum(int c, int d) {
		System.out.println("The sum of 2 number is " + (c + d));
		return 0;
	}
}

public class _04MethodReferenceTest {

	public static void main(String[] args) {
		Addition ad = (a, b) -> System.out.println("The add of 2 number is " + (a + b));
		ad.add(5, 8);

		Addition su = Summation::sum;
		su.add(4, 6);
	}

}
