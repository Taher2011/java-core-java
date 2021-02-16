package com.java._12streams;

import java.util.ArrayList;
import java.util.List;

public class _12WithoutFilter {

	public static List<String> startWithC(List<String> cityList) {
		List<String> updatedCitylist = new ArrayList<>();
		for (String city : cityList) {
			if (city.startsWith("C")) {
				updatedCitylist.add(city);
			}
		}
		return updatedCitylist;
	}

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

		List<String> updatedCitylist = startWithC(cityList);
		System.out.println("updatedCitylist " + updatedCitylist);

		System.out.println();

		List<Integer> listInt = new ArrayList<>();
		listInt.add(5);
		listInt.add(3);
		listInt.add(6);
		listInt.add(2);
		System.out.println("list " + listInt);

		List<Integer> evenList = evenNumber(listInt);
		System.out.println("evenList " + evenList);

	}

}
