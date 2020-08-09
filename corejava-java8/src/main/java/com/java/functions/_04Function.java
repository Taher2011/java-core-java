package com.java.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Student {

	private String name;
	private int marks;

	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}

}

public class _04Function {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Raj", 80));
		students.add(new Student("John", 67));
		students.add(new Student("Amir", 87));
		students.add(new Student("Peter", 44));

		Function<Student, String> f = s -> {
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

		for (Student student : students) {
			System.out.println("Student Name  " + student.getName());
			System.out.println("Student Marks " + student.getMarks());
			System.out.println("Student Grade " + f.apply(student));
			System.out.println();
		}
	}

}
