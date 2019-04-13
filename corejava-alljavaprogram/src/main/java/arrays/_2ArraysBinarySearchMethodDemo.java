package arrays;

import java.util.Arrays;

public class _2ArraysBinarySearchMethodDemo {

	public static void main(String[] args) {
		int[] i = { 13, 5, 1, 8, 6, 9 };
		Arrays.sort(i); //////////////////////////////////////////////////////////////////
		for (int j : i) {
			System.out.println(j);
		}
		System.out.println();
		System.out.println(Arrays.binarySearch(i, 5)); //////////////////////////////////////////////////////////////////
		System.out.println(Arrays.binarySearch(i, 10)); //////////////////////////////////////////////////////////////////
		
		System.out.println();
		
		String[] s = { "R", "E", "S", "A", "N" };
		Arrays.sort(s); //////////////////////////////////////////////////////////////////
		for (String j : s) {
			System.out.println(j);
		}
		System.out.println();
		System.out.println(Arrays.binarySearch(s, "S")); //////////////////////////////////////////////////////////////////
		System.out.println(Arrays.binarySearch(s, "F")); //////////////////////////////////////////////////////////////////
		
		System.out.println();
		
		Employee[] e = { new Employee(584), new Employee(324),
				new Employee(843), new Employee(113), new Employee(245),
				new Employee(754) };
		Arrays.sort(e, new Employee(000)); //////////////////////////////////////////////////////////////////
		for (Employee j : e) {
			System.out.println(j);
		}
		System.out.println();
		System.out.println(Arrays.binarySearch(e, new Employee(843), new Employee())); //////////////////////////////////////////////////////////////////
		System.out.println(Arrays.binarySearch(e, new Employee(844), new Employee())); //////////////////////////////////////////////////////////////////
	}

}
