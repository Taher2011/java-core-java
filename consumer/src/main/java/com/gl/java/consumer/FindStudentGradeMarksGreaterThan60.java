package com.gl.java.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
class Student {

	private String name;
	private double marks;

}

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

		Predicate<Student> p = s -> s.getMarks() >= 60;

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

		Consumer<Student> c = s -> {
			if (p.test(s)) {
				System.out.println("Student Name " + s.getName());
				System.out.println("Student Marks " + s.getMarks());
				String grade = f.apply(s);
				System.out.println("Student Grade " + grade);
				System.out.println();
			}
		};

		for (Student student : students) {
			c.accept(student);
		}

	}

}
