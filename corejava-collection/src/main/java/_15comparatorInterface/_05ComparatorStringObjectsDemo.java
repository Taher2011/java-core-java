package _15comparatorInterface;

import java.util.Comparator;
import java.util.TreeSet;

/*If we want to sort String objects alphabetical order in reverse 
 * we can use comparator because String by default implements 
 * Comparable and provides natural sorting order that is alphabetical.
 */

public class _05ComparatorStringObjectsDemo implements Comparator {

	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return -s1.compareTo(s2);
	}

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>(
				new _05ComparatorStringObjectsDemo()); // This constructor is used for customized sorting order.
		set.add("A");
		set.add("C");
		set.add("D");
		set.add("K");
		set.add("V");
		System.out.println(set);
	}

}
