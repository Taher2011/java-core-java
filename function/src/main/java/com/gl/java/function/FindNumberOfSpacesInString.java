package com.gl.java.function;

import java.util.function.Function;

public class FindNumberOfSpacesInString {

	public static void main(String[] args) {

		String[] names = new String[] { "Tah er", "P awan  ", "  Din esh" };

		getNumberOfSpacesInString(names);

	}

	private static void getNumberOfSpacesInString(String[] names) {

		Function<String, Integer> f = s -> s.length() - s.replace(" ", "").length();

		for (String name : names) {
			int count = f.apply(name);
			System.out.println("Number of spaces in " + name + " is " + count);
		}

	}

}
