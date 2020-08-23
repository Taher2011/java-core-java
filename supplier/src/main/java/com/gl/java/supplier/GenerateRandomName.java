package com.gl.java.supplier;

import java.util.function.Supplier;

public class GenerateRandomName {

	public static void main(String[] args) {
	
		Supplier<String> s = () -> {
			String[] s1 = { "Sunny", "Bunny", "Chinny", "Pinny" };
			int x = (int) (Math.random() * 4);
			return s1[x];
		};
		
		System.out.println(s.get());
	}

}
