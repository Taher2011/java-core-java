package com.java._12streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _15WithMap {

	public static Integer length(String city) {
		return city.length();

	}

	public static void main(String[] args) {
		List<String> cityList = new ArrayList<>();
		cityList.add("Ahemdabad");
		cityList.add("Mumbai");
		cityList.add("Chennai");
		cityList.add("Hyderabad");
		System.out.println("list " + cityList);
		
		for (String city : cityList) {
			System.out.println(city + " length is " + length(city));
		}

		List<Integer> lengthOfCities = cityList.stream().map(c -> c.length()).collect(Collectors.toList());

		int i = 0;
		for (String city : cityList) {
			System.out.println(
					city + " length is " + lengthOfCities.get(i));
			i++;
		}

	}

}
