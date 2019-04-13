package _07iteratorInterface;

import java.util.ArrayList;
import java.util.Iterator;

/* In Iterator we have remove capability along with read operation.
 * Iterator is applicable for any collection objects. 
 * It is uni-directional and move towards forward direction
 * and we can't perform add and replace operation
 * only read and remove operation.*/

class Employee {
	
	private String empName;

	public Employee(String empName) {
		super();
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee Name = " + empName ;
	}

}

public class _02IteratorDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 11; i++) {
			list.add(i);
		}
		System.out.println(list);

		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			if (integer % 2 == 0) {
				System.out.println(integer);
				// list.add(12); //It gives
				// "java.util.ConcurrentModificationException"
			} else {
				iterator.remove();
			}
		}
		System.out.println(list);
		
		System.out.println();
		
		ArrayList<Employee> listEmp = new ArrayList<Employee>();
		listEmp.add(new Employee("A"));
		listEmp.add(new Employee("F"));
		listEmp.add(new Employee("B"));
		listEmp.add(new Employee("W"));
		System.out.println(listEmp);
		
		Iterator<Employee> iteratorEmp = listEmp.iterator();
		while(iteratorEmp.hasNext()) {
			Employee employee = iteratorEmp.next();
			System.out.println(employee);
		}
		
	}

}
