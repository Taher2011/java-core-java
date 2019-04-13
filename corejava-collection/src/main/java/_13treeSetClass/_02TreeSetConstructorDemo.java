package _13treeSetClass;

import java.util.ArrayList;
import java.util.TreeSet;

public class _02TreeSetConstructorDemo {

	public static void main(String[] args) {

		/*
		 * It creates empty TreeSet object where the elements will be inserted
		 * according to default natural sorting order.
		 */
		TreeSet set1 = new TreeSet();

		/*
		 * It creates empty TreeSet object where the elements will be inserted
		 * according to custom sorting order specified by comparator object.
		 * TreeSet set2 = new TreeSet(Comparator c);
		 */

		/*
		 * It creates equivalent TreeSet object for given Collection
		 *  TreeSet set3 = new TreeSet(Collection c);
		 */
		ArrayList list = new ArrayList();
		list.add(1);
		// list.add("A"); //java.lang.ClassCastException:
		list.add(0);
		System.out.println("list is " + list);
		TreeSet set = new TreeSet(list);
		System.out.println("equivalent TreeSet is " + set);

		/*
		 * It creates equivalent TreeSet object for given SortedSet
		 * TreeSet set4 = new TreeSet(SortedSet c);
		 */

	}
}
