package _27collectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Below Sort method based on default natural order and list must contain homogeneous and comparable else get ClassCastException.
 * And list also must not contain null else get NullPointerException.*/

/*public static void sort(List list);*/

public class _01CollectionsSortMethodForNaturalSortingDemo {

	public List sortNaturalOrder(List list) {
		Collections.sort(list);
		return list;
	}

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add("D");
		list.add("W");
		list.add("W");
		list.add("S");
		list.add("A");
		// list.add(2); --> ClassCastException:
		// list.add(null); --> NullPointerException
		System.out.println("Before Sorting " + list);

		new _01CollectionsSortMethodForNaturalSortingDemo()
				.sortNaturalOrder(list);
		System.out.println("After Sorting " + list);
	}

}
