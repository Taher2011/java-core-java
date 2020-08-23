package com.gl.java.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SupplySystemDate {

	public static void main(String[] args) {

		Supplier<Date> s = () -> new Date();
	
		System.out.println(s.get());
	}

}
