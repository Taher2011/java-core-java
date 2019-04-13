package _28arraysClass;

import java.util.Arrays;

/* Below binarySearch method is used to search elements
 * of the array. Before calling binarySearch method array 
 * must be sorted otherwise we will get unpredictable results.
 * Successful search returns index(if element is present in sorted array).
 * Unsuccessful search returns insertion(if element is not present in sorted array).
 */

/*public static void binarySearch(Object[] list, Object target);*/

public class _04ArraysBinarySearchMethodForNaturalSortingDemo {

	public static void main(String[] args) {

		String[] strArray = { "R", "P", "G" };

		System.out.print("strArray array before sorting ");
		for (String string : strArray) {
			System.out.print(string + " ");
		}
		System.out.println();
		
		Arrays.sort(strArray);
		
		System.out.print("strArray array after  sorting ");
		for (String string : strArray) {
			System.out.print(string + " ");
		}
		System.out.println();
		
		System.out.println(Arrays.binarySearch(strArray, "G")); // If element is present in sorted array it gives successful search, i.e index position
		System.out.println(Arrays.binarySearch(strArray, "E")); // If element is not present in sorted array it gives successful search, i.e insertion position
	
	}

}
