package com.java.consumers;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

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

public class _02Consumer {

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

		Predicate<Student> p = s -> s.getMarks() > 60;

		Consumer<Student> c = s -> {
			System.out.println("Student Name  " + s.getName());
			System.out.println("Student Marks " + s.getMarks());
			System.out.println("Student Grade " + f.apply(s));
			System.out.println();
		};

		for (Student student : students) {
			if (p.test(student)) {
				c.accept(student);
			}

		}
	}

}
