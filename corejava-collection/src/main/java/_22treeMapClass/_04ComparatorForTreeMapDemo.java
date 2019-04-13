package _22treeMapClass;

import java.util.Comparator;
import java.util.TreeMap;

/* To Insert Employee objects into TreeMap
 * where sorting order is descending i.e customized
 */
class Employee1 implements Comparator<Employee1> {

	private Integer empId;

	public Employee1(Integer empId) {
		super();
		this.empId = empId;
	}

	public int compare(Employee1 employee1, Employee1 employee2) {
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
 * To Insert Department objects into TreeMap where sorting order is reverse of alphabetical order
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

public class _04ComparatorForTreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Employee1, String> treeMapEmp = new TreeMap<Employee1, String>(new Employee1(0)); // If we don't pass Employee1 object then JVM will internally call compareTo() which is
																			   // meant for natural sorting order. This constructor is used for customized sorting order.
		treeMapEmp.put(new Employee1(2), "Mumbai");
		treeMapEmp.put(new Employee1(6), "Indore");
		treeMapEmp.put(new Employee1(5), "Delhi");
		treeMapEmp.put(new Employee1(4), "Surat");
		System.out.println("Sorted Employee   is " + treeMapEmp);
		
		TreeMap<Department, String> treeMapDep = new TreeMap<Department, String>(new Department("")); // If we don't pass Department object then JVM will internally call compareTo() which is
																					  // meant for natural sorting order.. This constructor is used for customized sorting order.
		treeMapDep.put(new Department("Technical"), "E");
		treeMapDep.put(new Department("Veterinary"), "E");
		treeMapDep.put(new Department("English"), "E");
		treeMapDep.put(new Department("Industrial"), "E");
		treeMapDep.put(new Department("Veterinary"), "E");
		treeMapDep.put(new Department("SocialScience"), "E");
		System.out.println("Sorted Department is " + treeMapDep);

	}

}
