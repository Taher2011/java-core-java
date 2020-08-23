package com.gl.java.function;

import java.util.function.Function;

public class LengthOfString {

	public static void main(String[] args) {

		String[] names = new String[] { "Taher", "Pawan", "Dinesh" };

		getLengthOfString(names);

	}

	private static void getLengthOfString(String[] names) {

		Function<String, Integer> f = s -> s.length();

		for (String name : names) {
			int length = f.apply(name);
			System.out.println("The length of string " + name + " is " + length);
		}
	}

}
