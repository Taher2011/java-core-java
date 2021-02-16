package com.java._12streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _13WithFilter {

	public static List<Integer> evenNumber(List<Integer> listInt) {
		List<Integer> evenList = new ArrayList<>();
		for (Integer number : listInt) {
			if (number % 2 == 0) {
				evenList.add(number);
			}
		}
		return evenList;
	}

	public static void main(String[] args) {
		List<String> cityList = new ArrayList<>();
		cityList.add("Ahemdabad");
		cityList.add("Mumbai");
		cityList.add("Chennai");
		cityList.add("Hyderabad");
		System.out.println("list " + cityList);

		List<String> updatedCitylist = cityList.stream().filter(city -> city.startsWith("C"))
				.collect(Collectors.toList());
		System.out.println("updatedCitylist " + updatedCitylist);

		System.out.println();

		List<Integer> listInt = new ArrayList<>();
		listInt.add(5);
		listInt.add(3);
		listInt.add(6);
		listInt.add(2);
		System.out.println("list " + listInt);

		List<Integer> evenIntList = listInt.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
		System.out.println("evenIntList " + evenIntList);

	}

}
