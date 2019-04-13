package _27collectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* Below binarySearch method is used to search elements
 * of the list. Before calling binarySearch method List 
 * must be sorted according to custom sorting,otherwise 
 * we will get unpredictable results.
 * Successful search returns index(if element is present in sorted list).
 * Unsuccessful search returns insertion(if element is not present in sorted list).
 */

/*public static void binarySearch(List list, Object target, Comparator c);*/

public class _04CollectionsBinarySearchMethodForCustomSortingDemo implements Comparator{

	public int compare(Object object1, Object object2) {
		return object2.toString().compareTo(object1.toString());
	}
	
	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add(6);
		list.add(3);
		list.add(7);
		list.add(4);
		list.add(4);
		System.out.println("Before Sorting " + list);
		Collections.sort(list, new _04CollectionsBinarySearchMethodForCustomSortingDemo());
		System.out.println("After Sorting " + list);
		//If we dont pass comparator object in binarySearch method, we will get unpredictable results.
		System.out.println(Collections.binarySearch(list, 3, new _04CollectionsBinarySearchMethodForCustomSortingDemo())); // If element is present in sorted list it gives successful search, i.e index position
		System.out.println(Collections.binarySearch(list, 5, new _04CollectionsBinarySearchMethodForCustomSortingDemo())); // If element is not present in sorted list it gives successful search, i.e insertion position
	}

}
