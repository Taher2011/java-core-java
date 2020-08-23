package com.gl.java.predicate;

import java.util.function.Predicate;

public class NumberGreaterThan10AndEven {

	public static void main(String[] args) {

		Integer[] integerArray = new Integer[] { 73, 583, 66, 345, 93, 43, 78, 22, 83 };

		numberGreaterThan10AndEven(integerArray);

	}

	public static void numberGreaterThan10AndEven(Integer[] integerArray) {

		Predicate<Integer> p1 = i -> i > 10;

		Predicate<Integer> p2 = i -> i % 2 == 0;

		for (Integer integer : integerArray) {
			if (p1.and(p2).test(integer)) {
				System.out.println("Number greater than 10 and even are " + integer);
			}
		}

	}

}
