package _28arraysClass;

import java.util.Arrays;

/* Below Sort method based on custom order using comparator.

 /*public static void sort(Object[] objectArray, Comparator c);*/

class Student implements Comparable<Student> {

	private String stuId;

	public Student(String stuId) {
		super();
		this.stuId = stuId;
	}

	@Override
	public String toString() {
		return stuId + " ";
	}

	public int compareTo(Student o) {
		return ((String) o.stuId).compareTo(this.stuId);
	}
}

public class _02ArraysSortMethodForCustomSortingDemo {

	public static void main(String[] args) {
		Student e1 = new Student("45");
		Student e2 = new Student("16");
		Student e3 = new Student("24");

		Student[] stuArray = new Student[] { e1, e2, e3 };
		System.out.print("Student array before sorting ");
		for (Student student : stuArray) {
			System.out.print(student);
		}

		System.out.println();

		Arrays.sort(stuArray);

		System.out.print("Student array after  sorting using comparator ");
		for (Student student : stuArray) {
			System.out.print(student);
		}

	}
}
