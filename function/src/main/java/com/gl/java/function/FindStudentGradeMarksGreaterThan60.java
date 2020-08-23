package com.gl.java.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FindStudentGradeMarksGreaterThan60 {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
		students.add(new Student("Raj", 67.8));
		students.add(new Student("John", 87.8));
		students.add(new Student("Mike", 57.8));
		students.add(new Student("Amit", 77.8));

		getStudentGradeForMarksGreaterThan60(students);

	}

	private static void getStudentGradeForMarksGreaterThan60(List<Student> students) {

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

		Predicate<Student> p = s -> s.getMarks() >= 60;

		for (Student student : students) {
			if (p.test(student)) {
				String grade = f.apply(student);
				System.out.println("Student Name " + student.getName());
				System.out.println("Student Marks " + student.getMarks());
				System.out.println("Student Grade " + grade);
				System.out.println();
			}
		}

	}

}
