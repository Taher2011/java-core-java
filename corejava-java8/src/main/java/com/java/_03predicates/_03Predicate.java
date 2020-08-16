package com.java._03predicates;

import java.util.function.Predicate;

public class _03Predicate {

	public static void main(String[] args) {
		Predicate<String> p1 = name -> name.length() > 5;
		System.out.println(p1.test("Taher"));
	}

}
