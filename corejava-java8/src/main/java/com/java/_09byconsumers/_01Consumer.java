package com.java._09byconsumers;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
class Employee {

	public String name;
	public double salary;

}

public class _01Consumer {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		populate(employees);

		BiConsumer<Employee, Integer> c = (employee, increment) -> employee.salary = employee.getSalary() + increment;
		for (Employee employee2 : employees) {
			c.accept(employee2, 500);
		}

		for (Employee employee2 : employees) {
			System.out.println("Emp Name " + employee2.getName());
			System.out.println("Emp Salary " + employee2.getSalary());
		}
	}

	public static void populate(List<Employee> employees) {
		BiFunction<String, Double, Employee> f = (name, salary) -> new Employee(name, salary);
		employees.add(f.apply("Taher1", 8000.0));
		employees.add(f.apply("Taher2", 8300.0));
		employees.add(f.apply("Taher3", 8040.0));
	}

}
