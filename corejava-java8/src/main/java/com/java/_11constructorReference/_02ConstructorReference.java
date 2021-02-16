package com.java._11constructorReference;

class Department {

	public Department(int departmentId, String departmentName) {
		System.out.println("Department Id is " + departmentId);
		System.out.println("Department Name is " + departmentName);
	}
}

interface Dept {

	Department get(int departmentId, String departmentName);
}

public class _02ConstructorReference {

	public static void main(String[] args) {

		Dept lambdaDept = (i, s) -> {
			return new Department(i, s);
		};
		lambdaDept.get(123, "Medical");

		Dept constRefDept = Department::new;
		constRefDept.get(543, "Civil");
	}

}
