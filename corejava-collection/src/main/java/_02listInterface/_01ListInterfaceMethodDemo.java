package _02listInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/**
 * 
 * List is used to represent a group of individual object as single entity.
 * Duplicates are allowed and insertion order is preserved. Nulls are allowed.
 * Can add Heterogeneous objects.
 *
 */
public class _01ListInterfaceMethodDemo {

	/*
	 * to add particular object to the collection at specified index
	 */
	public void add(int index, Object object) {
		return;
	}

	/*
	 * to add group of objects(collection) to the collection at specified index
	 */
	public boolean addAll(int index, Collection<?> collection) {
		return true;
	}

	/*
	 * to remove particular object from the collection from specified index and
	 * it returns removed object
	 */
	public Object remove(int index) {
		return null;
	}

	/*
	 * to get particular object from specified index
	 */
	public Object get(int index) {
		return null;
	}

	/*
	 * to set new object at specified index and it returns old object
	 */
	public Object set(int index, Object object) {
		return null;
	}

	/*
	 * to get index of object from the collection
	 */
	public int indexOf(Object object) {
		return 0;
	}

	/*
	 * to get last index of object from the collection
	 */
	public int lastIndexOf(Object object) {
		return 0;
	}

	/*
	 * to iterate elements from the list one by one
	 */
	public ListIterator<?> listIterator() {
		return null;
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		// list.add(10, "A"); // we get runtime exception
		// "java.lang.IndexOutOfBoundsException: Index: 10, Size: 1"
	}

}
