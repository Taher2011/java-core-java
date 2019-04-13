package _03arrayListClass;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class _02ArrayListConstructorDemo {

	public static void main(String[] args) {

		/*
		 * It creates empty AL object with default initial capacity 10 Once AL
		 * reaches it max capacity then new AL object will be created
		 * NewCapacity = (CurrentCapacity * 3/2) + 1
		 */
		ArrayList list1 = new ArrayList();

		/*
		 * It creates empty AL object with specified initial capacity
		 * ArrayList list2 = new ArrayList(int initialCapacity);
		 */
		ArrayList list2 = new ArrayList(20);

		/*
		 * It creates equivalent AL object for given Collection
		 *  ArrayList list3 = new ArrayList(Collection c);
		 */
		Set set = new HashSet();
		set.add(1);
		set.add("A");
		System.out.println("Set is " + set);
		ArrayList list3 = new ArrayList(set);
		System.out.println("equivalent ArrayList is " + list3);
		

	}

}
