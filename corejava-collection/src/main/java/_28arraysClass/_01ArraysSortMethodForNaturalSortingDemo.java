package _28arraysClass;

import java.util.Arrays;

/* Below Sort method based on default natural order.

 /*public static void sort(Object[] objectArray);*/

class Employee implements Comparable<Employee> {

	private String empId;

	public Employee(String empId) {
		super();
		this.empId = empId;
	}

	@Override
	public String toString() {
		return empId + " ";
	}

	public int compareTo(Employee o) {
		return this.empId.compareTo((String) o.empId);
	}
}

public class _01ArraysSortMethodForNaturalSortingDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee("45");
		Employee e2 = new Employee("16");
		Employee e3 = new Employee("24");

		Employee[] empArray = new Employee[] { e1, e2, e3 };
		System.out.print("Employee array before sorting ");
		for (Employee employee : empArray) {
			System.out.print(employee);
		}

		System.out.println();

		Arrays.sort(empArray);

		System.out.print("Employee array after  sorting ");
		for (Employee employee : empArray) {
			System.out.print(employee);
		}

	}
}
