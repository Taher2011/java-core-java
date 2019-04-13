package _13treeSetClass;

import java.util.TreeSet;


/**
 * 
 * Underlying Data structure is BalancedTree.
 * Duplicate objects are not allowed.
 * Insertion order not preserved(All objects inserted based on some sorting order may be default natural sorting order or customized sorting order).
 * Heterogeneous objects are not allowed otherwise get ClassCast Exception.
 * Null insertion not allowed.
 *
 */
public class _01TreeSetDemo {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add("S");
		set.add("R");
		set.add("A");
		set.add("F");
		set.add("1");
		set.add("A");
		//set.add(null); //java.lang.NullPointerException
		//set.add(1); //java.lang.ClassCastException:
		System.out.println(set);
	}
}
