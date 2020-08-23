package com.gl.java.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class SalaryHikeForEmployeeSalaryLessThan25K {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Raj", 14467.00));
		employees.add(new Employee("Yash", 47467.00));
		employees.add(new Employee("Manish", 35467.00));
		employees.add(new Employee("Aniket", 27467.00));
		employees.add(new Employee("Suhas", 22467.00));

		salHikeForEmpSalLessThan25K(employees);

	}

	private static void salHikeForEmpSalLessThan25K(List<Employee> employees) {
		List<Employee> employeesWithSalHike = new ArrayList<>();

		Predicate<Employee> p = e -> e.getSalary() < 25000.0;

		Function<Employee, Employee> f = e -> {
			e.setSalary(e.getSalary() + 1200);
			return e;
		};

		for (Employee employee : employees) {
			if (p.test(employee)) {
				Employee employeeWithSalHike = f.apply(employee);
				employeesWithSalHike.add(employeeWithSalHike);
			}
		}
		System.out.println("Employees with salary hike " + employeesWithSalHike);
	}

}
