package com.java.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Student1 {

	private String name;
	private int marks;

	public Student1(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}

}

public class _05Function {

	public static void main(String[] args) {
		List<Student1> students = new ArrayList<Student1>();
		students.add(new Student1("Raj", 80));
		students.add(new Student1("John", 67));
		students.add(new Student1("Amir", 87));
		students.add(new Student1("Peter", 44));

		Predicate<Student1> p = s -> s.getMarks() > 60;

		Function<Student1, String> f = s -> {
			int marks = s.getMarks();
			String grade = "";
			if (marks >= 80)
				grade = "A[Distinction]";
			else if (marks >= 60)
				grade = "B[FC]";
			else if (marks >= 50)
				grade = "C[SC]";
			else if (marks >= 35)
				grade = "D[TC]";
			else
				grade = "E[Fail]";
			return grade;
		};

		for (Student1 student : students) {
			if (p.test(student)) {
				System.out.println("Student Name  " + student.getName());
				System.out.println("Student Marks " + student.getMarks());
				System.out.println("Student Grade " + f.apply(student));
				System.out.println();
			}

		}
	}

}
