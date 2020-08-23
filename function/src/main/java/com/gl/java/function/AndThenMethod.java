package com.gl.java.function;

import java.util.function.Function;

public class AndThenMethod {

	public static void main(String[] args) {

		Function<String, String> f1 = s -> s.toUpperCase();
		Function<String, String> f2 = s -> s.substring(0, 5);

		System.out.println(f1.andThen(f2).apply("taher ali"));

		Function<Integer, Integer> f3 = i -> i + i;
		Function<Integer, Integer> f4 = i -> i * i * i;

		System.out.println(f3.andThen(f4).apply(2));

	}

}
