package _27collectionsClass;

import java.util.ArrayList;
import java.util.Collections;

/* Below reverse method is used to reverse elements
 * of the list.
 */

/*public static void reverse(List list);*/

public class _05CollectionsReverseMethodDemo {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add(6);
		list.add(3);
		list.add(7);
		list.add(4);
		list.add(4);
		System.out.println("Before reversing " + list);
		Collections.reverse(list);
		System.out.println("After reversing " + list);
		
	}

}
