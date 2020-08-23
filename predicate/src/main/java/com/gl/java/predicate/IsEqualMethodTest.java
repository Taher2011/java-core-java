package com.gl.java.predicate;

import java.util.function.Predicate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
class Employee {

	private String name;
	private String city;
	private String designation;
	private double salary;

}

public class IsEqualMethodTest {

	public static void main(String[] args) {

		Employee employee = new Employee("Taher", "Indore", "Team Lead", 70000.0);
		Employee employee1 = new Employee("Sumit", "Mumbai", "Sr.Manager", 90000.0);
		Employee employee2 = new Employee("Sachin", "Pune", "Ass.Manager", 80000.0);

		Predicate<Employee> p = Predicate.isEqual(employee);

		System.out.println(p.test(employee));
		System.out.println(p.test(employee1));
		System.out.println(p.test(employee2));
	}

}
