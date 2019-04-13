package _01genericClass;

import java.util.ArrayList;

/* The main objective of Generic is : 
 * to provide type safety and 
 * to resolve type casting.
 * 
 * TypeCasting : 
 * In the case of Arrays at the time of retrieval
 * it is not required to perform type cast because 
 * there is guarantee for the type of the elements
 * present inside array.
 * 
 * String s[] = new String[10];
 * s[0] = "A";
 * String name1 = s[0]; //type casting is not required
 * 
 * But in the case of Collections at the time of retrieval
 * compulsory type casting to be performed because there is
 * no guarantee for the type of elements present inside the
 * Collection.
 * 
 * ArrayList l = new ArrayList();
 * l.add("A");
 * String name1 = l.get(0); // compile time error
 * 							// so casting is must
 */

public class _02GenericsBasicTypeCastingDemo {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("A");
		l.add("B");

		// String name1 = l.get(0); // Compile-time error Type mismatch: cannot convert from Object to String
		String name2 = (String) l.get(1); // Type casting is required.
	}

}
