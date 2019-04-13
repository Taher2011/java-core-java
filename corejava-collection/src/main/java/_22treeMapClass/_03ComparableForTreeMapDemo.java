package _22treeMapClass;

import java.util.TreeMap;
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

public class _03ComparableForTreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Employee, String> treeMapEmp = new TreeMap<Employee, String>();// This constructor is used for natural sorting order
		treeMapEmp.put(new Employee(2), "Mumbai");
		treeMapEmp.put(new Employee(6), "Indore");
		treeMapEmp.put(new Employee(5), "Delhi");
		treeMapEmp.put(new Employee(4), "Surat");
		System.out.println("Sorted Employee is " + treeMapEmp);

		TreeMap<Student, String> treeMapStu = new TreeMap<Student, String>();// This constructor is used for natural sorting order
		treeMapStu.put(new Student("R"), "AGrade");
		treeMapStu.put(new Student("T"), "VGrade");
		treeMapStu.put(new Student("V"), "VGrade");
		treeMapStu.put(new Student("R"), "CGrade");
		treeMapStu.put(new Student("G"), "EGrade");
		treeMapStu.put(new Student("G"), "RGrade");
		treeMapStu.put(new Student("G"), "SGrade");
		treeMapStu.put(new Student("E"), "DGrade");
		treeMapStu.put(new Student("A"), "AGrade");
		System.out.println("Sorted Student  is " + treeMapStu);
	}

}
