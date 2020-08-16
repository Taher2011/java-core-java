package com.java._04functions;

import java.util.function.Function;

public class _01Function {

	public static void main(String[] args) {

		Function<Integer, Integer> f = i -> i * i;
		System.out.println(f.apply(4));

	}

}
