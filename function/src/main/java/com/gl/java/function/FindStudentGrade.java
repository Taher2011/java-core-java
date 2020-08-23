package com.gl.java.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
class Student {

	private String name;
	private double marks;

}

public class FindStudentGrade {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
		students.add(new Student("Raj", 67.8));
		students.add(new Student("John", 87.8));
		students.add(new Student("Mike", 57.8));
		students.add(new Student("Amit", 77.8));

		getStudentGrade(students);

	}

	private static void getStudentGrade(List<Student> students) {

		Function<Student, String> f = s -> {
			double marks = s.getMarks();
			if (marks >= 80) {
				return "Topper";
			} else if (marks >= 70) {
				return "Distinction";
			} else if (marks >= 60) {
				return "First Division";
			} else if (marks >= 50) {
				return "Second Division";
			}
			return "Fail";
		};

		for (Student student : students) {
			String grade = f.apply(student);
			System.out.println("Student Name " + student.getName());
			System.out.println("Student Marks " + student.getMarks());
			System.out.println("Student Grade " + grade);
			System.out.println();
		}

	}

}
