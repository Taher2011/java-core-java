package com.java._11constructorReference;

import lombok.Getter;

@Getter
class Student {

	String name;
	int rollNo;
	int marks;
	int age;

	public Student(String name, int rollNo, int marks, int age) {
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
		this.age = age;
	}

	public void createStudent() {
		System.out.println("Student " + name + " created");
	}

}

interface Stud {
	Student get(String name, int rollNo, int marks, int age);
}

public class _03ConstructorReference {

	public static void main(String[] args) {
		Stud student = Student::new;
		Student studentObj = student.get("Taher", 79, 78, 30);
		studentObj.createStudent();
	}

}
