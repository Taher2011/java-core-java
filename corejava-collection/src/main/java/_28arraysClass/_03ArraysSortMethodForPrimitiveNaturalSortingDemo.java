package _28arraysClass;

import java.util.Arrays;

/* Below Sort method based on default natural order.

 /*public static void sort(primitive[] primitiveArray);*/

public class _03ArraysSortMethodForPrimitiveNaturalSortingDemo {

	public static void main(String[] args) {

		int[] intArray = new int[] { 2, 5, 3 };
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

	}
}
