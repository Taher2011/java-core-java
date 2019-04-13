package _10hashSetClass;

import java.util.HashSet;

class Employee {
	
}

/**
 * 
 * Underlying Data structure is Hashtable
 *
 */
public class _01HashSetDemo {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("E");
		set.add("E");
		set.add("A");
		set.add("V");
		set.add(10);
		set.add(new Employee());
		System.out.println(set);
	}

}
