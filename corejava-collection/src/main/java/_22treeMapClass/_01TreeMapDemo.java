package _22treeMapClass;

import java.util.TreeMap;
import java.util.TreeSet;

/*
 * Underlying Data structure is RedBlackTree.
 * Duplicate keys are not allowed but values can be duplicated
 * Insertion order not preserved(All objects inserted based on some sorting order of keys may be default natural sorting order or customized sorting order).
 * Heterogeneous keys are not allowed otherwise get ClassCast Exception.
 * If sorting order is natural sorting order then keys should be homogeneous and comparable.
 * If sorting order is customized sorting order then keys should not be homogeneous and comparable.
 * Null insertion not allowed.
 */
public class _01TreeMapDemo {

	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		map.put(1, "X");
		map.put(8, "B");
		map.put(2, "W");
		map.put(6, "R");
		map.put(4, "N");
		// map.put(null); //java.lang.NullPointerException
		// map.put("1", "1"); //java.lang.ClassCastException:
		System.out.println(map);
	}
}
