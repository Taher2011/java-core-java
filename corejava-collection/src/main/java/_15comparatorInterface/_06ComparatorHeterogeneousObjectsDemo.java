package _15comparatorInterface;

import java.util.Comparator;
import java.util.TreeSet;
 
/* We can add Heterogeneous objects in TreeSet only
 * when we are using comparator*/
class Person {
	
	int perId;

	public Person(int perId) {
		super();
		this.perId = perId;
	}

	@Override
	public String toString() {
		return "" + perId;
	}
	
	
}

public class _06ComparatorHeterogeneousObjectsDemo implements Comparator {

	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s1.compareTo(s2);
	}

	public static void main(String[] args) {
		TreeSet set = new TreeSet(new _06ComparatorHeterogeneousObjectsDemo()); // This constructor is used for customized sorting order.
		set.add(new String("A"));
		set.add(new StringBuffer("B"));
		set.add(new Integer(1));
		set.add(new Person(2));
		System.out.println(set);
	}

}
