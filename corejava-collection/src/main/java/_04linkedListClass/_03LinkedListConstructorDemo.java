package _04linkedListClass;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class _03LinkedListConstructorDemo {

	public static void main(String[] args) {

		// It creates empty LL object  default initial capacity concept not applicable in LL
		LinkedList list1 = new LinkedList();

		// It creates equivalent LL object for given Collection
		// LinkedList list3 = new LinkedList(Collection c);
		Set set = new HashSet();
		set.add(1);
		set.add("A");
		System.out.println("Set is " + set);
		LinkedList list3 = new LinkedList(set);
		System.out.println("equivalent LinkedList is " + list3);
		

	}

}
