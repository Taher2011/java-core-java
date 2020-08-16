package com.java._10constructorReference;

class Employee {
	public Employee() {
		System.out.println("Employee class constructor execution");
	}
}

interface Emp {
	Employee get();
}

public class _01ConstructorReference {

	public static void main(String[] args) {
		Emp employee = Employee::new;
		employee.get();
	}

}
