package _27collectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* Below Sort method based on default customized order and 
 * list can contain heterogeneous object.
 */

/*public static void sort(List list, Comparator c);*/

public class _02CollectionsSortMethodForCustomSortingDemo implements Comparator {

	public int compare(Object object1, Object object2) {
		return object2.toString().compareTo(object1.toString());
	}

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add("D");
		list.add("W");
		list.add("W");
		list.add("S");
		list.add("A");
		System.out.println("Before Sorting " + list);
		Collections.sort(list,
				new _02CollectionsSortMethodForCustomSortingDemo());
		System.out.println("After Sorting using comparator " + list);

	}

}
