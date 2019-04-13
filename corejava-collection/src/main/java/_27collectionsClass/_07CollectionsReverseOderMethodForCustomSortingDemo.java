package _27collectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* Below reverseOrder method is used to 
 * sort the list first and returns comparator for reverse order  
 */

/*public static Comparator reverseOder(Comparator c);*/

public class _07CollectionsReverseOderMethodForCustomSortingDemo implements Comparator {
	
	/*
	 * Sort the list according to last character of word and return comparator
	 * for reverse order
	 */  
	public int compare(Object o1, Object o2) {

		String s1 = (String)o1;
		String s2 = (String)o2;
		
		Character c1 = s1.charAt(s1.length()-1);
		Character c2 = s2.charAt(s2.length()-1);
		
		return c1.compareTo(c2);
	}
	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add("Tahery");
		list.add("Tahera");
		list.add("Taheri");
		list.add("Tahers");
		System.out.println("Before reversing " + list);

		Collections.sort(list, Collections.reverseOrder(new _07CollectionsReverseOderMethodForCustomSortingDemo()));
		
		System.out.println(list);
	}

}
