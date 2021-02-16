package com.java._10methodReference;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
class Employee {

	private String name;
	private String id;
}

public class _07NormalMethodRef {

	public static void main(String[] args) {

		List<String> l = new ArrayList<>();
		l.add("taher");
		l.add("amit");
		l.add("yash");

		List<String> collect = l.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(collect);

		List<String> collect1 = l.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(collect1);

		Employee e1 = new Employee("Taher", "1234");
		Employee e2 = new Employee("Taher1", "12341");
		List<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);

		List<String> names = employees.stream().map(Employee::getName).collect(Collectors.toList());
		System.out.println(names);
	}

}
