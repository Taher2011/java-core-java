package com.java._12streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class _05CustomSortedMethod {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(35);
		list.add(52);
		list.add(15);
		list.add(54);
		list.add(22);
		list.add(1);
		System.out.println("Values before sorting " + list);

		/// Sorting using Stream method for Integer objects
		List<Integer> descendingOrderList = list.stream().sorted((i1, i2) -> (i1 < i2) ? +1 : (i1 > i2) ? -1 : 0)
				.collect(Collectors.toList());
		System.out.println("Values after sorting  " + descendingOrderList);

		System.out.println();
		
		List<String> names = new ArrayList<>();
		names.add("Tom");
		names.add("Mac");
		names.add("Kerry");
		names.add("John");
		names.add("Bob");
		names.add("Peter");
		System.out.println("Values before sorting " + names);

		List<String> descendingOrderName = names.stream().sorted((n1, n2) -> n2.compareTo(n1))
				.collect(Collectors.toList());
		System.out.println("Values after sorting  " + descendingOrderName);
	}

}
