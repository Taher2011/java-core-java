package com.java.functions;

import java.util.function.Function;

public class _03Function {

	public static void main(String[] args) {

		Function<String, String> f = s -> s.toUpperCase();
		System.out.println("Name is " + f.apply("Taher Ali"));

	}

}
