package _03copyOnWriteArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _06ArrayListIteratorRemoveMethodDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);

		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			Integer number = iterator.next();
			if (number % 2 == 0) {
				System.out.println(list);
			} else {
				iterator.remove();
			}
		}
		System.out.println(list);
	}

}
