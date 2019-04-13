package collectionClassUtility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparator<Employee> {
	private String empId;

	public Employee() {
		super();
	}

	public Employee(String empId) {
		super();
		this.empId = empId;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public int compare(Employee e1, Employee e2) {
		return e2.getEmpId().compareTo(e1.getEmpId());
	}

	@Override
	public String toString() {
		return "EmpId = " + empId;
	}
	
}

public class _1CollectionsSortMethodDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Y");
		list.add("E");
		list.add("D");
		list.add("V");
		list.add("R");
		System.out.println("unsorted list " + list);

		Collections.sort(list); ////////////////////////////
		System.out.println("sorted list   " + list);

		Employee e1 = new Employee("E");
		Employee e2 = new Employee("C");
		Employee e3 = new Employee("T");
		Employee e4 = new Employee("X");
		List<Employee> listEmp = new ArrayList<>();
		listEmp.add(e1);
		listEmp.add(e2);
		listEmp.add(e3);
		listEmp.add(e4);
		System.out.println("unsorted Emp list " + listEmp);
		Collections.sort(listEmp, new Employee()); ////////////////////////////
		System.out.println("sorted Emp list   " + listEmp);
		
	}

}
