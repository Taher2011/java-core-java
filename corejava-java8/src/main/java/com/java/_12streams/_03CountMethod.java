package com.java._12streams;

import java.util.ArrayList;
import java.util.List;

public class _03CountMethod {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		list.add(30);
		System.out.println("Values " + list);

		getCountOfNumberLessThan15(list);
	}

	private static void getCountOfNumberLessThan15(List<Integer> list) {
		long lessThan15 = list.stream().filter(I -> I < 15).count();
		System.out.println("Count of values less than 15 are    " + lessThan15);
	}

}
