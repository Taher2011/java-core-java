package com.java._03predicates;

import java.util.function.Predicate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Employee {

	private String name;
	private String company;

}

public class _02Predicate {

	public static void main(String[] args) {

		Employee e = new Employee();
		e.setName("Taher");
		e.setCompany("GL");

		Predicate<Employee> e1 = e2 -> e2.getName().equals("Taher") && e2.getCompany().equals("GL");
		System.out.println(e1.test(e));
		
		Predicate<Employee> e3 = e4 -> e4.getName().equals("Taher") && e4.getCompany().equals("CSC");
		System.out.println(e3.test(e));

	}

}
