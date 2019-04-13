package _11linkedHashSetClass;

import java.util.LinkedHashSet;

class Employee {

}

/**
 * 
 * Underlying Data structure is Hashtable and LinkedList. Constructors and
 * Methods are same as HashSet with only differences that it maintain insertion
 * order.
 *
 */
public class _01LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();
		set.add("E");
		set.add("E");
		set.add("A");
		set.add("V");
		set.add(10);
		set.add(new Employee());
		System.out.println(set);
	}

}
