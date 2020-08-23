package com.gl.java.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
class Employee {

	private String name;
	private double salary;

}

public class TotalMonthlySalOfAllEmp {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Raj", 74467.00));
		employees.add(new Employee("Yash", 47467.00));
		employees.add(new Employee("Manish", 75467.00));
		employees.add(new Employee("Aniket", 57467.00));

		totalMonthlySalaryOfAllEmp(employees);
	}

	private static void totalMonthlySalaryOfAllEmp(List<Employee> employees) {

		Function<List<Employee>, Double> f = l -> {
			double total = 0;
			for (Employee employee : l) {
				total = total + employee.getSalary();
			}
			return total;
		};

		double total = f.apply(employees);
		System.out.println("Total monthly salary of all employees is " + total);
	}

}
