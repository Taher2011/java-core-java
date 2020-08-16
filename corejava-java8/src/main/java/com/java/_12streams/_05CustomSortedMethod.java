package com.java._12streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Test implements Comparator<Integer> {

	public int compare(Integer i1, Integer i2) {
		if (i1 > i2) {
			return -1;
		} else if (i1 < i2) {
			return +1;
		} else {
			return 0;
		}
	}
}

public class _05CustomSortedMethod {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(35);
		list.add(52);
		list.add(15);
		list.add(54);
		list.add(22);
		list.add(1);
		System.out.println("Values before sorting " + list);
		/// Sorting using normal method
		Collections.sort(list, new Test());
		System.out.println("Values after sorting  " + list);

		/// Sorting using lambda function
		Collections.sort(list, (i1, i2) -> (i1 < i2) ? +1 : (i1 > i2) ? -1 : 0);
		System.out.println("Values after sorting  " + list);
		
		/// Sorting using Stream method
		List<Integer> descendingOrderList = list.stream().sorted((i1, i2) -> (i1 < i2) ? +1 : (i1 > i2) ? -1 : 0).collect(Collectors.toList());
		System.out.println("Values after sorting  " + descendingOrderList);
	}

}
