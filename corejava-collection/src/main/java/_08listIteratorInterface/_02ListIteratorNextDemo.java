package _08listIteratorInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

/* In ListIterator we have add and replace capability along with read and add operation.
 * ListIterator is applicable for any List objects. 
 * ListIterator is bi-directional and move towards forward direction and backward direction*/

public class _02ListIteratorNextDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Mumbai");
		list.add("Indore");
		list.add("Hyerabad");
		list.add("Chennai");
		list.add("Delhi");

		System.out.println(list);

		ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			String s = (String) listIterator.next();
			if (s.equals("Chennai")) {
				listIterator.remove();
				System.out.println(list);
			} else if (s.equals("Hyerabad")) {
				listIterator.add("Kocchi");
				listIterator.add("Patna");
				System.out.println(list);
			} else if (s.equals("Delhi")) {
				listIterator.set("Noida");
				System.out.println(list);
			}
		}
		System.out.println(list);
	}

}
