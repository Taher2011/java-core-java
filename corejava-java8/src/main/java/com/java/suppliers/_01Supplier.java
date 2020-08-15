package com.java.suppliers;

import java.util.Date;
import java.util.function.Supplier;

public class _01Supplier {

	public static void main(String[] args) {

		Supplier<Date> s = () -> new Date();
		System.out.println(s.get());
	}

}
