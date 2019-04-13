package _03copyOnWriteArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class _07CopyOnWriteArrayListIteratorRemoveMethodDemo {

	public static void main(String[] args) {
		List<Integer> list = new CopyOnWriteArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);

		ListIterator<Integer> iterator = list.listIterator();
		while (iterator.hasNext()) {
			Integer number = iterator.next();
			if (number % 2 == 0) {
				System.out.println(list);
			} else {
				iterator.add(5); // java.lang.UnsupportedOperationException
			}
		}
		System.out.println(list);
	}

}
