package com.gl.java.predicate;

import java.util.function.Predicate;

public class NameStartWithT {

	public static void main(String[] args) {

		String[] names = new String[] { "Taher", "Tausif", "Taufeek", "Anil", "Bhupesh" };

		nameStartWithT(names);
	}

	private static void nameStartWithT(String[] names) {

		Predicate<String> p = s -> s.charAt(0) == 'T';

		for (String name : names) {
			if (p.test(name))
				System.out.println("Name starts with T are " + name);
		}
	}

}
