package arrays;

import java.util.Arrays;
import java.util.Comparator;

class Employee implements Comparator<Employee> {
	private int empId;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId) {
		super();
		this.empId = empId;
	}

	public int compare(Employee e1, Employee e2) {
		if (e1.empId > e2.empId) {
			return 1;
		} else if (e1.empId < e2.empId) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "empId = " + empId;
	}

}

public class _1ArraysSortMethodDemo {

	public static void main(String[] args) {

		int[] i = { 3, 1, 0, 3, 6, 2 };
		System.out.println("int array before sorting");
		for (int j : i) {
			System.out.println(j);
		}
		System.out.println();
		Arrays.sort(i); //////////////////////////////////////////////////////////////////
		System.out.println("int array after sorting");
		for (int j : i) {
			System.out.println(j);
		}

		System.out.println();

		String[] s = { "R", "E", "S", "A", "N" };
		System.out.println("String array before sorting");
		for (String j : s) {
			System.out.println(j);
		}
		System.out.println();
		Arrays.sort(s); //////////////////////////////////////////////////////////////////
		System.out.println("String array after sorting");
		for (String j : s) {
			System.out.println(j);
		}

		System.out.println();

		Employee[] e = { new Employee(584), new Employee(324),
				new Employee(843), new Employee(113), new Employee(245),
				new Employee(754) };
		System.out.println("Employee array before sorting");
		for (Employee j : e) {
			System.out.println(j);
		}
		System.out.println();
		Arrays.sort(e, new Employee(000)); //////////////////////////////////////////////////////////////////
		System.out.println("Employee array before sorting");
		for (Employee j : e) {
			System.out.println(j);
		}
	}

}
