package _28arraysClass;

import java.util.Arrays;
import java.util.Comparator;

/* Below binarySearch method is used to search elements
 * of the array. Before calling binarySearch method array 
 * must be sorted using comaparator for custom sorting 
 * otherwise we will get unpredictable results.
 * Successful search returns index(if element is present in sorted array).
 * Unsuccessful search returns insertion(if element is not present in sorted array).
 */

/*public static void binarySearch(Object[] list, Object target, Comparator c);*/

public class _05ArraysBinarySearchMethodForCustomSortingDemo implements	Comparator {

	public int compare(Object object1, Object object2) {
		return object2.toString().compareTo(object1.toString());
	}

	public static void main(String[] args) {

		String[] strArray = { "P", "G", "R" };

		System.out.print("strArray array before sorting ");
		for (String string : strArray) {
			System.out.print(string + " ");
		}
		System.out.println();
		
		Arrays.sort(strArray, new _05ArraysBinarySearchMethodForCustomSortingDemo());
		
		System.out.print("strArray array after  sorting using comparator ");
		for (String string : strArray) {
			System.out.print(string + " ");
		}
		System.out.println();
		
		System.out.println(Arrays.binarySearch(strArray, "G",  new _05ArraysBinarySearchMethodForCustomSortingDemo())); // If element is present in sorted array it gives successful search, i.e index position
		System.out.println(Arrays.binarySearch(strArray, "E",  new _05ArraysBinarySearchMethodForCustomSortingDemo())); // If element is not present in sorted array it gives successful search, i.e insertion position
	
	}

}
