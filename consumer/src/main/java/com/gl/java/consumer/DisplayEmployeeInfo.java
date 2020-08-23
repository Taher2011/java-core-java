package com.gl.java.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
class Employee {

	private String name;
	private String project;
	private String empId;
}

public class DisplayEmployeeInfo {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Jack", "Metlife", "Jac345"));
		employees.add(new Employee("Pack", "Highmark", "Pac345"));
		employees.add(new Employee("Mack", "BankOfEngland", "Mac345"));
		employees.add(new Employee("Rack", "ATnT", "Rac345"));

		Consumer<List<Employee>> c = employeeList -> {
			for (Employee employee : employeeList) {
				System.out.println("Employee Name : " + employee.getName());
				System.out.println("Employee Project : " + employee.getProject());
				System.out.println("Employee Id : " + employee.getEmpId());
				System.out.println();
			}
		};

		c.accept(employees);

	}

}
