package com.java._12streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _02MapMethod {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		list.add(30);
		System.out.println("Values " + list);

		getDoubleOfEachElementInList(list);
		getDoubleOfEachElementInListStreams(list);
	}

	private static void getDoubleOfEachElementInList(List<Integer> list) {
		List<Integer> doubleElement = new ArrayList<Integer>();
		for (Integer i : list) {
			doubleElement.add(i * 2);
		}
		System.out.println("Double value of each element without using streams " + doubleElement);
	}

	private static void getDoubleOfEachElementInListStreams(List<Integer> list) {
		List<Integer> doubleElement = new ArrayList<Integer>();
		doubleElement = list.stream().map(I -> I * 2).collect(Collectors.toList());
		System.out.println("Double value of each element with using streams    " + doubleElement);
	}

}
