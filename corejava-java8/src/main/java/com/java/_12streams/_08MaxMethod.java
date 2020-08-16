package com.java._12streams;

import java.util.ArrayList;
import java.util.List;

public class _08MaxMethod {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(5);
		intList.add(2);
		intList.add(6);
		intList.add(1);
		intList.add(10);
		
		System.out.println("elements " + intList);

		int maxElementinAscendingOrder = intList.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("maximum element in ascending order " + maxElementinAscendingOrder);
		
		int maxElementinDescendingOrder = intList.stream().max((i1, i2) -> -i1.compareTo(i2)).get();
		System.out.println("maximum element in descending order " + maxElementinDescendingOrder);
	}

}
