package com.java._12streams;

import java.util.ArrayList;
import java.util.List;

public class _07MinMethod {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(5);
		intList.add(2);
		intList.add(6);
		intList.add(1);
		intList.add(10);

		int minElementinAscendingOrder = intList.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("minimum element in ascending order " + minElementinAscendingOrder);
		
		int minElementinDescendingOrder = intList.stream().min((i1, i2) -> -i1.compareTo(i2)).get();
		System.out.println("minimum element in descending order " + minElementinDescendingOrder);
	}

}
