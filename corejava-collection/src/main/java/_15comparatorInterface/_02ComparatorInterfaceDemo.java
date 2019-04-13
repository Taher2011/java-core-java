package _15comparatorInterface;

import java.util.Comparator;
import java.util.TreeSet;

/* To Insert Employee objects into TreeSet
 * where sorting order is descending i.e customized
 */
class Employee implements Comparator<Employee> {

	private Integer empId;

	public Employee(Integer empId) {
		super();
		this.empId = empId;
	}

	public int compare(Employee employee1, Employee employee2) {
		// Note : employee1 is the object which is to be inserted and employee2
		// is
		// the object which is already inserted.
		Integer i1 = (Integer) employee1.empId;
		Integer i2 = (Integer) employee2.empId;
		if (i1 > i2) {
			return -1;
		} else if (i1 < i2) {
			return 1;
		} else {
			return 0;
		}

		// return -i1.compareTo(i2);
	}

	@Override
	public String toString() {
		return "" + empId;
	}

}

/*
 * To Insert Department objects into TreeSet where sorting order is reverse of alphabetical order
 * i.e customized
 */
class Department implements Comparator<Department> {

	private String deptName;

	public Department(String deptName) {
		super();
		this.deptName = deptName;
	}

	public int compare(Department department1, Department department2) {
		// Note : department1 is the object which is to be inserted and department2
		// is the object which is already inserted.
		String s1 = department1.toString();
		String s2 = department2.toString();
		return -s1.compareTo(s2);
	}
	
	@Override
	public String toString() {
		return deptName;
	}

}

public class _02ComparatorInterfaceDemo {

	public static void main(String[] args) {
		TreeSet<Employee> treeSetEmp = new TreeSet<Employee>(new Employee(0)); // If we don't pass Employee object then JVM will internally call compareTo() which is
																			   // meant for natural sorting order. This constructor is used for customized sorting order.
		treeSetEmp.add(new Employee(10));
		treeSetEmp.add(new Employee(0));
		treeSetEmp.add(new Employee(15));
		treeSetEmp.add(new Employee(5));
		treeSetEmp.add(new Employee(20));
		treeSetEmp.add(new Employee(20));
		System.out.println("Sorted Employee   is " + treeSetEmp);
		
		TreeSet<Department> treeSetDep = new TreeSet<Department>(new Department("")); // If we don't pass Employee object then JVM will internally call compareTo() which is
																					  // meant for natural sorting order.. This constructor is used for customized sorting order.
		treeSetDep.add(new Department("T"));
		treeSetDep.add(new Department("V"));
		treeSetDep.add(new Department("E"));
		treeSetDep.add(new Department("I"));
		treeSetDep.add(new Department("V"));
		treeSetDep.add(new Department("S"));
		System.out.println("Sorted Department is " + treeSetDep);

	}

}
