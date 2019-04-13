package _15abstractclass;

abstract class Person {
	String name;
	int age;
}

class Student extends Person {
	int rollNo;
	int marks;

	public Student(String name, int age, int rollNo, int marks) {
		this.name = name;
		this.age = age;
		this.rollNo = rollNo;
		this.marks = marks;
	}

}

public class _01AbstractClassConstructorDemo {

	public static void main(String[] args) {
		Student student = new Student("Ali", 30, 12, 98);
	}

}
