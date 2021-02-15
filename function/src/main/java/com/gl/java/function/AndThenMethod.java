package com.gl.java.function;

import java.util.function.Function;

public class AndThenMethod {

	public static void main(String[] args) {

		/*
		 * f1.andThen(f2).apply("taher ali"); => first execute f1.apply("taher ali") method and based on
		 * output first method, f2.apply(result_of_f1_method) method execute.
		 */
		Function<String, String> f1 = s -> s.toUpperCase();
		Function<String, Integer> f2 = s -> s.substring(0, 5).length();

		System.out.println(f1.andThen(f2).apply("taher ali"));

		Function<Integer, Integer> f3 = i -> i + i;
		Function<Integer, Integer> f4 = i -> i * i * i;

		System.out.println(f3.andThen(f4).apply(2));

	}

}
