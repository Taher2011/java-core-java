package _14comparableInterface;

import java.util.TreeSet;

/* Comparable is meant for default natural sorting order.
 */

class Student implements Comparable<Student> {// If Student object don't
												// implement Comparable then we
												// will get ClassCastException

	private String stuName;

	public Student(String stuName) {
		this.stuName = stuName;
	}

	public int compareTo(Student student) {
		if (this.stuName.compareTo(student.stuName) > 1) {
			return +1;
		} else if (this.stuName.compareTo(student.stuName) < -1) {
			return -1;
		} else {
			return 0;
		}
	}

	public String toString() {
		return stuName;
	}
}

class Employee implements Comparable<Employee> {// If Employee object don't
												// implement Comparable then we
												// will get ClassCastException

	private int empId;

	public Employee(int empId) {
		this.empId = empId;
	}

	public int compareTo(Employee employee) {
		if (this.empId < employee.empId) {
			return -1;
		} else if (this.empId > employee.empId) {
			return +1;
		} else {
			return 0;
		}
	}

	public String toString() {
		return "" + empId;
	}
}

public class _02ComparableApproachOneDemo {

	public static void main(String[] args) {
		TreeSet<Employee> treeSetEmp = new TreeSet<Employee>();// This constructor is used for natural sorting order
		treeSetEmp.add(new Employee(5));
		treeSetEmp.add(new Employee(2));
		treeSetEmp.add(new Employee(7));
		treeSetEmp.add(new Employee(4));
		treeSetEmp.add(new Employee(5));
		System.out.println("Sorted Employee is " + treeSetEmp);

		TreeSet<Student> treeSetStu = new TreeSet<Student>();// This constructor is used for natural sorting order
		treeSetStu.add(new Student("R"));
		treeSetStu.add(new Student("T"));
		treeSetStu.add(new Student("V"));
		treeSetStu.add(new Student("R"));
		treeSetStu.add(new Student("G"));
		treeSetStu.add(new Student("G"));
		treeSetStu.add(new Student("G"));
		treeSetStu.add(new Student("E"));
		treeSetStu.add(new Student("A"));
		System.out.println("Sorted Student  is " + treeSetStu);
	}

}
