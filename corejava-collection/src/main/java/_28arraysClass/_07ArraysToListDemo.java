package _28arraysClass;

import java.util.Arrays;
import java.util.List;

/* The below method is used to convert array into list.
 * public static List asList(Object[] objectArray);
 * 
 * But it won't create an new list object for existing array.
 * 
 * By using array reference if we perform any changes, automatically
 * changes will be reflected to list.
 * 
 * By using list reference if we perform any changes, automatically
 * changes will be reflected to array.
 * 
 * By using list reference if we perform any operation(add,remove),
 * we will get UnSupportedOperationException. because array are fixed
 * in size it can neither be increased or decreased.
 */

public class _07ArraysToListDemo {

	public static void main(String[] args) {

		String[] strArray = { "F", "D", "M" };

		List list = Arrays.asList(strArray);
		System.out.println("List is " + list);

		strArray[1] = "N"; // By using array reference if we perform any
							// changes, automatically changes will be reflected
							// to list.
		System.out.println("List is " + list);

		// list.remove(2); //UnSupportedOperationException
		// list.add("J"); //UnSupportedOperationException
		// list.add(new Integer(0)); //UnsupportedOperationException
		// list.set(0, new Integer(0)); //ArrayStoreException
		
		list.set(2, "W"); // By using list reference if we perform any
							// changes, automatically changes will be reflected
							// to array.
		System.out.print("Array is ");
		for (String s : strArray) {
			System.out.print(s + " ");
		}
		System.out.println();

	}

}
