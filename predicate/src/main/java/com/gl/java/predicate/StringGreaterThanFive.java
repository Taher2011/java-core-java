package com.gl.java.predicate;

import java.util.function.Predicate;

public class StringGreaterThanFive {

	public static void main(String[] args) {

		String[] stringArray = new String[] { "Taher", "Amit", "Pratik", "Rahul", "Vikas" };

		stringGreaterThanFive(stringArray);
	}

	private static void stringGreaterThanFive(String[] stringArray) {

		Predicate<String> p = s -> s.length() > 5;

		for (String string : stringArray) {
			if (p.test(string)) {
				System.out.println("String greater than 5 are " + string);
			}
		}
	}

}
