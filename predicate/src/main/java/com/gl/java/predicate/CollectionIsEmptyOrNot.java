package com.gl.java.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
class ITEmployee {
	private String name;
	private double salary;
}

public class CollectionIsEmptyOrNot {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<>();
		List<String> l2 = new ArrayList<>();
		List<ITEmployee> l3 = addITEmployee();

		collectionIsEmptyOrNot(l1);
		collectionIsEmptyOrNot(l2);
		collectionIsEmptyOrNot(l3);
	}

	public static List<ITEmployee> addITEmployee() {
		ITEmployee employee1 = new ITEmployee("John1", 5600.0);
		ITEmployee employee2 = new ITEmployee("John2", 5600.0);
		ITEmployee employee3 = new ITEmployee("John3", 5600.0);
		ITEmployee employee4 = new ITEmployee("John4", 5600.0);
		List<ITEmployee> employees = new ArrayList<>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		return employees;
	}

	private static <T> void collectionIsEmptyOrNot(List<T> list) {

		Predicate<List> p = l -> l.isEmpty();

		System.out.println("Is list empty " + p.test(list));
	}

}
