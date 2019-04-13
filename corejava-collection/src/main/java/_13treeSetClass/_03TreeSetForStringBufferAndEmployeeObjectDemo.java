package _13treeSetClass;

import java.util.TreeSet;

class Employee {

	public Employee(int i) {

	}
}

/*
 * Below program will give java.lang.ClassCastException because StringBuffer and
 * Employee class doesn't implements Comparable. If we are depending on default
 * natural sorting order compulsory object should be Homogeneous and Comparable.
 * Only String and Wrapper classes implements Comparable interface.
 */
public class _03TreeSetForStringBufferAndEmployeeObjectDemo {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(new StringBuffer("S"));
		set.add(new StringBuffer("D"));
		set.add(new StringBuffer("T"));
		set.add(new StringBuffer("R"));
		set.add(new StringBuffer("1"));
		System.out.println(set);

		TreeSet setEmp = new TreeSet();
		setEmp.add(new Employee(5));
		setEmp.add(new Employee(2));
		setEmp.add(new Employee(5));
		setEmp.add(new Employee(4));
		System.out.println(setEmp);
	}
}
