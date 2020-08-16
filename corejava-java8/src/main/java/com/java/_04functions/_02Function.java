package com.java._04functions;

import java.util.function.Function;

public class _02Function {

	public static void main(String[] args) {

		Function<String, Integer> f = s -> s.length();
		System.out.println("length is " + f.apply("Taher Ali"));

	}

}
