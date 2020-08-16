package com.java._12streams;

import java.util.ArrayList;
import java.util.List;

public class _10ForeachMethod {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		for (Integer integer : list) {
			System.out.println(integer);
		}

		System.out.println();

		// using stream concept
		list.stream().forEach(System.out::println);
	}

}
