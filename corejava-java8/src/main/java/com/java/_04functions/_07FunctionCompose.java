package com.java._04functions;

import java.util.function.Function;

public class _07FunctionCompose {

	public static void main(String[] args) {

		/*
		 * f1.compose(f2).apply(2); => here just opposite to andThen() method. first
		 * f2.apply() and then f1.apply(output_of_f2_method) execute.
		 */
		Function<Integer, Integer> f1 = i -> i * 2;
		Function<Integer, Integer> f2 = i -> i * i * i;

		System.out.println(f1.compose(f2).apply(2));

	}

}
