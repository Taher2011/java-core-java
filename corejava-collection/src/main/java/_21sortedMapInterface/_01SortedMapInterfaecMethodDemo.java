package _21sortedMapInterface;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/*
 * SortedMap is Child interface of Map and used to represent a group of
 * key-values pairs object according to some sorting order of keys without
 * duplicates.
 */
public class _01SortedMapInterfaecMethodDemo {

	/* returns the first key of the sorted map */
	public Object firstKey() {
		return null;
	}

	/* returns the last key of the sorted map */
	public Object lastKey() {
		return null;
	}

	/* returns the sorted map whose elements are less than key */
	public Object headMap(Object key) {
		return null;
	}

	/* returns the sorted map whose elements are greater than or equal to key */
	public Object tailMap(Object key) {
		return null;
	}

	/*
	 * returns the sorted map whose elements are greater than or equal to key1
	 * and less than to key2
	 */
	public Object subMap(Object key1, Object key2) {
		return null;
	}

	/*
	 * returns the comparator object that describes underlying sorting technique
	 */
	public Comparator comparator() {
		return null;
	}

	public static void main(String[] args) {
		SortedMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(101, "A");
		map.put(102, "B");
		map.put(104, "C");
		map.put(106, "D");
		map.put(108, "E");
		map.put(110, "F");

		System.out.println("first() return first key of the sorted map  is "
				+ map.firstKey());
		System.out.println("last() return last key of the sorted map  is "
				+ map.lastKey());
		System.out
				.println("headMap(106) returns sorted map whose elements are less than 106 are                "
						+ map.headMap(106));
		System.out
				.println("tailMap(106) returns sorted map whose elements are greater than or equal to 106 are "
						+ map.tailMap(106));
		System.out
				.println("subMap(101, 115) returns sorted map whose elements are greater than or equal to 101 and less than 115 "
						+ map.subMap(101, 115));
		System.out
				.println("comparator() returns if we are using default natural sorting order"
						+ map.comparator());
	}

}
