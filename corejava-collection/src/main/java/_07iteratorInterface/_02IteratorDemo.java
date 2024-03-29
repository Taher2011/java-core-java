package _07iteratorInterface;

import java.util.ArrayList;
import java.util.Iterator;

/* In Iterator we have remove capability along with read operation.
 * Iterator is applicable for any collection objects. 
 * It is uni-directional and move towards forward direction
 * and we can't perform add and replace operation
 * only read and remove operation.*/

/*
 * Why Iterator doesn't have add() ?
 * Iterator will be used to iterate through a set/list/queue. All these collections have their own logic for ordering. For e.g "TreeSet" is a sorted data structure. 
 * Now while iterating through a treeSet of let {2,5,7,19,22}; when the cursor is at 7 ,programmer tries to add 29. in this scenario TreeSet would be dis-sorted and 
 * corrupted.Hence add() should not be allowed.
 * But in remove () we are only deleting an element from a particular position which can never harm the ordering. So remove() is allowed.
 */

class Employee {

	private String empName;

	public Employee(String empName) {
		super();
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee Name = " + empName;
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
				// list.remove(1); //It gives
				// "java.util.ConcurrentModificationException"
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
		while (iteratorEmp.hasNext()) {
			Employee employee = iteratorEmp.next();
			System.out.println(employee);
		}

	}

}
