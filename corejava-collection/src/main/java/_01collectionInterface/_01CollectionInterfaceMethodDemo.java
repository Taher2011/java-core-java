package _01collectionInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * Collection is used to represent a group of individual object as single entity
 *
 */
public class _01CollectionInterfaceMethodDemo {

	/*
	 * to add particular object to the collection
	 */
	public boolean add(Object object) {
		return true;
	}

	/*
	 * to add group of objects(collection) to the collection
	 */
	public boolean addAll(Collection<?> collection) {
		return true;
	}

	/*
	 * to remove particular object from the collection
	 */
	public boolean remove(Object object) {
		return true;
	}

	/*
	 * to remove group of objects(collection) from the collection
	 */
	public boolean removeAll(Collection<?> collection) {
		return true;
	}

	/*
	 * to remove all group of objects(collection) from the collection except the
	 * group of object being passed as argument
	 */
	public boolean retainAll(Collection<?> collection) {
		return true;
	}

	/*
	 * to remove all group of objects(collection) from the collection
	 */
	public void clear() {
		return;
	}

	/*
	 * to check whether object exist in the collection
	 */
	public boolean contains(Object object) {
		return true;
	}

	/*
	 * to check whether group of objects(collection) exist in the collection
	 */
	public boolean containsAll(Collection<?> collection) {
		return true;
	}

	/*
	 * to return size of the collection
	 */
	public int size() {
		return 0;
	}

	/*
	 * to check whether collection is empty
	 */
	public boolean isEmpty() {
		return true;
	}

	/*
	 * to convert collection into the array
	 */
	public Object[] toArray() {
		return new Object[] {};
	}

	/*
	 * to iterate elements from the collection one by one
	 */
	public Iterator<?> iterator() {
		return null;
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add(10, "A");
	}

}
