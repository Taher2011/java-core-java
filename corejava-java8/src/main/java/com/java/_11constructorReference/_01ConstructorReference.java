package com.java._11constructorReference;

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

		Emp lambdaEmp = () -> {
			return new Employee();
		};
		lambdaEmp.get();

		Emp constRefEmp = Employee::new;
		constRefEmp.get();
	}

}
