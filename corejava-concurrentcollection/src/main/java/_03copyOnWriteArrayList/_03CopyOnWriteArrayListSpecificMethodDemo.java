package _03copyOnWriteArrayList;

import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;

public class _03CopyOnWriteArrayListSpecificMethodDemo {

	/*
	 * If the object is already present then object won't be added and returns
	 * false. If object is not present then only object will be added.
	 */
	public boolean addIfAbsent(Object object) {
		return false;
	}

	/*
	 * If the elements of collection are already present then elements won't be
	 * added and returns 0. If elements of collection are not present then only
	 * elements will be added and returns the number of elements added.
	 */
	public int addAllAbsent(Collection<String> collection) {
		return 0;
	}

	public static void main(String[] args) {
		CopyOnWriteArrayList<String> cowal1 = new CopyOnWriteArrayList<String>();
		cowal1.add("A");
		cowal1.add("B");
		cowal1.add("C");
		cowal1.add("C");
		System.out.println(cowal1);

		System.out.println(cowal1.addIfAbsent("C"));
		System.out.println(cowal1);

		CopyOnWriteArrayList<String> cowal2 = new CopyOnWriteArrayList<String>();
		cowal2.add("A");
		cowal2.add("B");
		cowal2.add("C");
		cowal2.add("D");

		System.out.println(cowal1.addAllAbsent(cowal2));
		System.out.println(cowal1);
	}
}
