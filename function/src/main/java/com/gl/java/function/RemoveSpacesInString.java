package com.gl.java.function;

import java.util.function.Function;

public class RemoveSpacesInString {

	public static void main(String[] args) {

		String[] names = new String[] { "Tah er", "P awan  ", "  Din esh" };

		removeSpacesInString(names);
	}

	private static void removeSpacesInString(String[] names) {

		Function<String, String> f = s -> s.replace(" ", "");

		for (String name : names) {
			String nameWithoutSpace = f.apply(name);
			System.out.println("Name without space for " + name + " is " + nameWithoutSpace);
		}
	}

}
