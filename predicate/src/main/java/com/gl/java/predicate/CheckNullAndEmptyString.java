package com.gl.java.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CheckNullAndEmptyString {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("Taher");
		names.add("Sunil");
		names.add("");
		names.add(null);

		removeNullAndEmptyString(names);

	}

	private static void removeNullAndEmptyString(List<String> names) {

		Predicate<String> p = s -> s != null && s.length() != 0;

		System.out.print("The valid Names from list are :");
		for (String name : names) {
			if (p.test(name)) {
				System.out.print(name + " ");
			}
		}
	}

}
