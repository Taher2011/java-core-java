package _08listIteratorInterface;
/*
 * Iterator will be used to iterate through a set/list/queue. All these collections have their own logic for ordering. 
 * For e.g "TreeSet" is a sorted data structure. Now while iterating through a treeSet of let {2,5,7,19,22}; when the cursor is at 7 ,programmer tries to add 29. 
 * in this scenario treeset would be dis-sorted and corrupted.Hence add method should not be allowed.

 * But in remove () we are only deleting an element from a particular
 * position which can never harm the ordering. So its allowed.

 * Coming to ListIterator which allows add(). Remember its used only for List, which maintains order of its elements according to insertion
 * order.So if we add an element at any given point , the ordering
 * algorithm wont be hampered.
 */

public class _01ListIteratorMethodDemo {

	public boolean hasNext() {
		return true;
	}

	public Object next() {
		return null;
	}

	public int nextIndex() {
		return 0;
	}

	public boolean hasPrevious() {
		return true;
	}

	public Object previous() {
		return null;
	}

	public int previousIndex() {
		return 0;
	}

	public void remove() {

	}

	public void add(Object object) {

	}

	public void set(Object object) {

	}

	public static void main(String[] args) {

	}

}
