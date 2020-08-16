package com.java._12streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _11ToArrayMethod {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		Integer[] intArray = list.stream().toArray(Integer[]::new);
		for (Integer integer : intArray) {
			System.out.println(integer);
		}
		
		System.out.println();
		
		///Using stream concept
		Stream.of(intArray).forEach(System.out::println);
	}

}
