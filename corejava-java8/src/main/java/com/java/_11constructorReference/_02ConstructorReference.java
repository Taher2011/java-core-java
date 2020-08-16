package com.java._11constructorReference;

class Department {

	public Department() {
		System.out.println("Department class constructor execution");
	}

	public Department(int departmentId) {
		System.out.println("Department Id is " + departmentId);
	}
}

interface Dept {
	Department get(int departmentId);
}

public class _02ConstructorReference {

	public static void main(String[] args) {
		Dept department = Department::new;
		department.get(1234);
	}

}
