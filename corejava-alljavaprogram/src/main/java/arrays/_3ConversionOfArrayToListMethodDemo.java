package arrays;

import java.util.Arrays;
import java.util.List;

public class _3ConversionOfArrayToListMethodDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] s = { 3,3,4,1,8,6};
		List<Integer> list = Arrays.asList(s);
		System.out.println(list);
		
		s[2] = 7;
		System.out.println(list);

		System.out.println();
		
		list.set(0, 9);
		for (Integer s1 : s) {
			System.out.println(s1);
		}
		
		System.out.println();

		list.remove(0);
		System.out.println(list);
	}

}
