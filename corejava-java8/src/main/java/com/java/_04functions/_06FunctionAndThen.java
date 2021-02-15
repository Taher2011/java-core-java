package com.java._04functions;

import java.util.function.Function;

public class _06FunctionAndThen {

	public static void main(String[] args) {
		/*
		 * f1.andThen(f2).apply(2); => first execute f1.apply(10) method and based on
		 * output first method, f2.apply(result_of_f1_method) method execute.
		 */
		Function<Integer, Integer> f1 = i -> i * 2;
		Function<Integer, Integer> f2 = i -> i * i * i;
		
		System.out.println(f1.andThen(f2).apply(2));

	}

}
