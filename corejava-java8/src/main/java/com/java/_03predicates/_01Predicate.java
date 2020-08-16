package com.java._03predicates;

import java.util.function.Predicate;

public class _01Predicate {

	public static void main(String[] args) {
		Predicate<Integer> p1 = i -> i % 2 == 0;
		System.out.println(p1.test(10));

	}

}
