package _01genericClass;

import java.util.ArrayList;

/* The main objective of Generic is : 
 * to provide type safety and 
 * to resolve type casting.
 * 
 * TypeSafety : 
 * Arrays are type safe i.e we can sure for the type of
 * elements present inside array.
 * For example, if we need to hold only String type of objects
 * by mistake if we add any other type of objects then we will 
 * get compile time error.
 * 
 * String s[] = new String[10];
 * s[0] = "A";
 * s[1] = 10; //compile time error
 * 
 * But Collections are not type safe i.e. we can't give guarantee
 * for the type of elements present inside Collections.
 * For example, if we need to hold only String type of objects
 * by mistake if we add any other type of objects then we won't 
 * get compile time error. but program get fails at run time.
 * 
 * ArrayList l = new ArrayList();
 * l.add("A");
 * l.add(1);
 * String name1 = (String)l.get(0);
 * String name2 = (String)l.get(1); //run time exception i.e ClassCastException
 */

public class _01GenericsBasicTypeSafetyDemo {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("A");
		l.add("B");
		l.add(1);

		String name1 = (String) l.get(0);
		String name2 = (String) l.get(1);
		String name3 = (String) l.get(2); // Runtime exception
											// java.lang.ClassCastException
	}
}
