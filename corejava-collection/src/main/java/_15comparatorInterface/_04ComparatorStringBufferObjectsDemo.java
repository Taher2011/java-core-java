package _15comparatorInterface;

import java.util.Comparator;
import java.util.TreeSet;

/*If we want to sort StringBuffer objects as alphabetical order 
 * we can use comparator because StringBuffer by default does not implements 
 * Comparable. So we have to use comparator to sort StringBuffer objects.
 */

public class _04ComparatorStringBufferObjectsDemo implements Comparator {

	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s1.compareTo(s2);
	}

	public static void main(String[] args) {
		TreeSet<StringBuffer> treeSet = new TreeSet<StringBuffer>(
				new _04ComparatorStringBufferObjectsDemo()); // This constructor is used for customized sorting order.
		treeSet.add(new StringBuffer("H"));
		treeSet.add(new StringBuffer("E"));
		treeSet.add(new StringBuffer("Z"));
		treeSet.add(new StringBuffer("Q"));
		treeSet.add(new StringBuffer("W"));

		System.out.println(treeSet);
	}

}
