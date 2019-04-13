package _15abstractclass;

abstract class Person1 {
	String name;
	int age;

	public Person1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}

class Student1 extends Person1 {
	int rollNo;
	int marks;

	public Student1(String name, int age, int rollNo, int marks) {
		super(name, age);
		this.rollNo = rollNo;
		this.marks = marks;
	}

}

public class _02AbstractClassConstructorDemo {

	public static void main(String[] args) {
		Student1 student1 = new Student1("Ali", 30, 12, 98);
	}

}
