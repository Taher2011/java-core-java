package com.gl.java.function;

import java.util.function.Function;

public class IdentityMethodTest {

	public static void main(String[] args) {

		Function<String, String> f = Function.identity();
		System.out.println(f.apply("Taher"));
		
	}

}
