package _27collectionsClass;

import java.util.ArrayList;
import java.util.Collections;

/* Below reverseOrder method is used to 
 * sort the list first and returns comparator for reverse order  
 */

/*public static Comparator reverseOder();*/

public class _06CollectionsReverseOderMethodForNaturalSortingDemo {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add(6);
		list.add(3);
		list.add(7);
		list.add(4);
		list.add(4);
		System.out.println("Before reversing " + list);

		Collections.sort(list, Collections.reverseOrder());
		
		System.out.println(list);
	}

}
