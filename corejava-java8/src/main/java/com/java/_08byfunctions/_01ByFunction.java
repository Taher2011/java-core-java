package com.java._08byfunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
class Employee {

	private int empNo;
	private String name;

}

public class _01ByFunction {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();
		BiFunction<Integer, String, Employee> f = (empNo, name) -> new Employee(empNo, name);
		employees.add(f.apply(123, "Utkarsh1"));
		employees.add(f.apply(223, "Utkarsh2"));
		employees.add(f.apply(323, "Utkarsh3"));

		for (Employee employee : employees) {
			System.out.println("Employee No " + employee.getEmpNo());
			System.out.println("Employee Name " + employee.getName());
		}
	}

}
