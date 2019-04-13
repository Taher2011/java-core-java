package _03copyOnWriteArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class _08CopyOnWriteArrayListIteratorDemo {

	public static void main(String[] args) {
		List<Integer> list = new CopyOnWriteArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println("list is " + list);

		Iterator<Integer> iterator = list.iterator();
		list.add(5); // After getting iterator we are trying to perform any
						// modification to the list, it won't be reflected to
						// the iterator because new list object(list1) will get
						// created and iterator is pointing to old object(list)
						// so iterator won't reflect new added value 5. If we
						// replace CopyOnWriteArrayList with ArrayList we will
						// get ConcurrentModificationException.
		System.out.println("after adding list is " + list);

		while (iterator.hasNext()) {
			Integer number = iterator.next();
			System.out.println("number is " + number);
		}
		System.out.println(list);
	}

}
