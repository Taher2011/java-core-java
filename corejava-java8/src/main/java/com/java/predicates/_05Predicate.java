package com.java.predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Student {

	private String name;
	private double salary;

	public Student(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

}

public class _05Predicate {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Raj", 3000));
		students.add(new Student("John", 1000));
		students.add(new Student("Amir", 2000));
		students.add(new Student("Peter", 3200));

		Predicate<Student> p = s -> s.getSalary() > 3000;

		for (Student student : students) {
			if (p.test(student)) {
				System.out.println("Name is " + student.getName() + " and salary is " + student.getSalary());
			}
		}

	}
}
