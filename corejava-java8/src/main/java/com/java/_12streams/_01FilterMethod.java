package com.java._12streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _01FilterMethod {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		list.add(30);

		getEvenNumberList(list);
		getEvenNumberListUsingStreams(list);
	}

	private static void getEvenNumberList(List<Integer> list) {
		List<Integer> listEven = new ArrayList<Integer>();
		for (Integer even : list) {
			if (even % 2 == 0) {
				listEven.add(even);
			}
		}
		System.out.println("Even number list without using streams " + listEven);
	}

	private static void getEvenNumberListUsingStreams(List<Integer> list) {
		List<Integer> listEven = new ArrayList<Integer>();
		listEven = list.stream().filter(I -> I % 2 == 0).collect(Collectors.toList());
		System.out.println("Even number list with using streams    " + listEven);
	}

}
