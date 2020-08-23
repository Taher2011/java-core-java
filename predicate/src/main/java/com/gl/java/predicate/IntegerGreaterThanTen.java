package com.gl.java.predicate;

import java.util.function.Predicate;

public class IntegerGreaterThanTen {

	public static void main(String[] args) {

		Integer[] integerArray = new Integer[] { 3, 37, 5, 53, 53, 4, 26 };

		integerGreaterThanTen(integerArray);
	}

	private static void integerGreaterThanTen(Integer[] integerArray) {

		Predicate<Integer> p = i -> i > 10;

		for (Integer integer : integerArray) {
			if (p.test(integer)) {
				System.out.println("Number greater than 10 are " + integer);
			}
		}
	}

}
