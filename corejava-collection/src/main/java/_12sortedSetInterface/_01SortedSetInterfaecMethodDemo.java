package _12sortedSetInterface;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 
 * SortedSet is Child interface of Set and used to represent a group of
 * individual object according to some sorting order without duplicates.
 * 
 */
public class _01SortedSetInterfaecMethodDemo {

	/* returns the first element of the sorted set */
	public Object first() {
		return null;
	}

	/* returns the last element of the sorted set */
	public Object last() {
		return null;
	}

	/* returns the sorted set whose elements are less than object */
	public Object headSet(Object object) {
		return null;
	}

	/* returns the sorted set whose elements are greater than or equal to object */
	public Object tailSet(Object object) {
		return null;
	}

	/*
	 * returns the sorted set whose elements are greater than or equal to
	 * object1 and less than to object2
	 */
	public Object subSet(Object object1, Object object2) {
		return null;
	}

	/*
	 * returns the comparator object that describes underlying sorting technique
	 */
	public Comparator comparator() {
		return null;
	}

	public static void main(String[] args) {
		SortedSet<Integer> set = new TreeSet<Integer>();
		set.add(100);
		set.add(101);
		set.add(104);
		set.add(106);
		set.add(110);
		set.add(115);
		set.add(120);

		System.out.println("first() return first element of the sorted set  is " + set.first());
		System.out.println("last()  return last  element of the sorted set  is " + set.last());
		System.out.println("headSet(106) returns sorted set whose elements are less than 106 are                " + set.headSet(106));
		System.out.println("tailSet(106) returns sorted set whose elements are greater than or equal to 106 are " + set.tailSet(106));
		System.out.println("subSet(101, 115) returns sorted set whose elements are greater than or equal to 101 and less than 115 " + set.subSet(101, 115));
		System.out.println("comparator() returns if we are using default natural sorting order" +set.comparator());
	}

}
