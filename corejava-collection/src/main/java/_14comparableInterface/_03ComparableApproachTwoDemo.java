package _14comparableInterface;

import java.util.TreeSet;

/* Comparable is meant for default natural sorting order.
 */

class Student1 implements Comparable<Student1> {// If Student object don't
												// implement Comparable then we
												// will get ClassCastException

	private String stuName;

	public Student1(String stuName) {
		this.stuName = stuName;
	}

	public int compareTo(Student1 student) {
		return this.stuName.compareTo(student.stuName);
	}

	public String toString() {
		return stuName;
	}
}

class Employee1 implements Comparable<Employee1> {// If Employee object don't
													// implement Comparable then
													// we
													// will get
													// ClassCastException

	private int empId;

	public Employee1(int empId) {
		this.empId = empId;
	}

	public int compareTo(Employee1 employee) {
		Integer i1 = this.empId;
		Integer i2 = employee.empId;
		return i1.compareTo(i2);
	}

	public String toString() {
		return "" + empId;
	}
}

public class _03ComparableApproachTwoDemo {

	public static void main(String[] args) {
		TreeSet<Employee1> treeSetEmp = new TreeSet<Employee1>();// This constructor is used for natural sorting order
		treeSetEmp.add(new Employee1(5));
		treeSetEmp.add(new Employee1(2));
		treeSetEmp.add(new Employee1(7));
		treeSetEmp.add(new Employee1(4));
		treeSetEmp.add(new Employee1(5));
		System.out.println("Sorted Employee is " + treeSetEmp);

		TreeSet<Student1> treeSetStu = new TreeSet<Student1>();// This constructor is used for natural sorting order
		treeSetStu.add(new Student1("R"));
		treeSetStu.add(new Student1("T"));
		treeSetStu.add(new Student1("V"));
		treeSetStu.add(new Student1("R"));
		treeSetStu.add(new Student1("G"));
		treeSetStu.add(new Student1("G"));
		treeSetStu.add(new Student1("G"));
		treeSetStu.add(new Student1("E"));
		treeSetStu.add(new Student1("A"));
		System.out.println("Sorted Student  is " + treeSetStu);
	}

}
