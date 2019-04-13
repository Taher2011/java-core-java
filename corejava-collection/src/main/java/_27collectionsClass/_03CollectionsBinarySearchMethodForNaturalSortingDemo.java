package _27collectionsClass;

import java.util.ArrayList;
import java.util.Collections;

/* Below binarySearch method is used to search elements
 * of the list. Before calling binarySearch method List 
 * must be sorted otherwise we will get unpredictable results.
 * Successful search returns index(if element is present in sorted list).
 * Unsuccessful search returns insertion(if element is not present in sorted list).
 */

/*public static void binarySearch(List list, Object target);*/

public class _03CollectionsBinarySearchMethodForNaturalSortingDemo {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add(6);
		list.add(3);
		list.add(7);
		list.add(4);
		list.add(4);
		System.out.println("Before Sorting " + list);
		Collections.sort(list);
		System.out.println("After Sorting " + list);
		System.out.println(Collections.binarySearch(list, 7)); // If element is present in sorted list it gives successful search, i.e index position
		System.out.println(Collections.binarySearch(list, 9)); // If element is not present in sorted list it gives successful search, i.e insertion position
	}

}
