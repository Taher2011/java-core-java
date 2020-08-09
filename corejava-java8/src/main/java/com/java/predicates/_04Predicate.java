package com.java.predicates;

import java.util.function.Predicate;

public class _04Predicate {

	public static void main(String[] args) {
		String[] names = { "Taher", "Amit", "Tarun", "Rahul", "Pratik" };
		Predicate<String> p1 = name -> name.length() > 4;
		for (String name : names) {
			if (p1.test(name))
				System.out.println(name);
		}
	}
}
