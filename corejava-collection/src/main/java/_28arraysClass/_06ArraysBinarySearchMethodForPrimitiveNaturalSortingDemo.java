package _28arraysClass;

import java.util.Arrays;

/* Below binarySearch method is used to search elements
 * of the array. Before calling binarySearch method array 
 * must be sorted otherwise we will get unpredictable results.
 * Successful search returns index(if element is present in sorted array).
 * Unsuccessful search returns insertion(if element is not present in sorted array).
 */

/*public static void binarySearch(primitive[] list, primitive target);*/

public class _06ArraysBinarySearchMethodForPrimitiveNaturalSortingDemo {

	public static void main(String[] args) {

		int[] intArray = { 4, 3, 5 };

		System.out.print("intArray array before sorting ");
		for (int i : intArray) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		Arrays.sort(intArray);
		
		System.out.print("intArray array after  sorting ");
		for (int i : intArray) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println(Arrays.binarySearch(intArray, 4)); // If element is present in sorted array it gives successful search, i.e index position
		System.out.println(Arrays.binarySearch(intArray, 7)); // If element is not present in sorted array it gives successful search, i.e insertion position
	
	}

}
