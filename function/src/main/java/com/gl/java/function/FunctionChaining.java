package com.gl.java.function;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionChaining {

	private static Scanner sc;

	public static void main(String[] args) {

		Function<String, String> f1 = s -> s.toLowerCase();
		Function<String, String> f2 = s -> s.substring(0, 5);

		sc = new Scanner(System.in);

		System.out.println("Enter User Name:");
		String userName = sc.next();

		System.out.println("Enter Password:");
		String password = sc.next();

		if (f1.andThen(f2).apply(userName).equals("taher") && password.equals("java")) {
			System.out.println("Valid User");
		} else {
			System.out.println("Invalid User");
		}

	}

}
