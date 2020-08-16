package com.java._12streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _06CustomSortedMethod {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("A");
		names.add("AAAA");
		names.add("AA");
		names.add("A");
		names.add("XXX");
		names.add("AAA");
		System.out.println("Values before sorting " + names);

		List<String> increasingLengthOrderSorting = names.stream().sorted((s1, s2) -> {
			if (s1.length() > s2.length()) {
				return 1;
			} else if (s1.length() < s2.length()) {
				return -1;
			} else {
				return s1.compareTo(s2);
			}
		}).collect(Collectors.toList());

		System.out.println("Values after sorting " + increasingLengthOrderSorting);

	}

}
