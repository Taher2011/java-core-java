package _08listIteratorInterface;

import java.util.LinkedList;
import java.util.ListIterator;

/* In ListIterator we have add and replace capability along with read and add operation.
 * ListIterator is applicable for any List objects. 
 * ListIterator is bi-directional and move towards forward direction and backward direction*/

public class _03ListIteratoPreviousDemo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Mumbai");
		list.add("Indore");
		list.add("Hyerabad");
		list.add("Chennai");
		list.add("Delhi");

		ListIterator<String> listIterator = list.listIterator(list.size()); //Returns a list-iterator of the elements in this list (in propersequence),
																			//starting at the specified position in the list. 
		while (listIterator.hasPrevious()) {
			String s = (String) listIterator.previous();
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
