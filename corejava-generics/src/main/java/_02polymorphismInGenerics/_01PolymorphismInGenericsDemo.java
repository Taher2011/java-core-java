package _02polymorphismInGenerics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* Polymorphism concept only applicable for 
 * BaseType but not for Parameter type.
 * 
 * ArrayList<String> l = new ArrayList<String>();
 * 
 * At line10 "ArrayList<String>" ,
 * "ArrayList" is BaseType 
 * whereas "<String>" ParameterType.  
 */

public class _01PolymorphismInGenericsDemo {

	public static void main(String[] args) {

		/* Valid */
		ArrayList<String> l1 = new ArrayList<String>();

		/* Valid */
		List<String> l2 = new ArrayList<String>();

		/* Valid */
		Collection<String> l3 = new ArrayList<String>();

		/*
		 * InValid because polymorphism only applicable for BaseType but not for
		 * TypeParameter, get compile time error saying incompatible types
		 */
		// List<Object> l4 = new ArrayList<String>();

	}

}
