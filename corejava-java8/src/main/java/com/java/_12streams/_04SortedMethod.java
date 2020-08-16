package com.java._12streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _04SortedMethod {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(35);
		list.add(52);
		list.add(15);
		list.add(54);
		list.add(22);
		list.add(1);
		System.out.println("Values before sorting " + list);

		getSortedList(list);
	}

	private static void getSortedList(List<Integer> list) {
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println("Values after sorting  " + sortedList);
	}

}
