package _08objectTypeCasting;

public class _01TypeCastingTipsDemo {

	public static void main(String[] args) {

		// A b = (C) d;
		
//================================================================================================================================================================================
		// Point 1 Compile time checking 1, the type of 'd' and 'C' must have
		// relation either
		// Child to Parent or Parent to Child or same type.
		// Otherwise we will get compile time error saying "Inconvertible type"

		// Example 1
		Object o = new String("T");
		StringBuffer sb = (StringBuffer) o;

		// Example 2
		String s = new String("T");
		// StringBuffer sb1 = (StringBuffer) s; //Compile time error
//================================================================================================================================================================================
		// Point 2 Compile time checking 2, 'C' must be either
		// same or derived type of 'A'.
		// Otherwise we will get compile time error saying "Incompatible type"

		// Example 1
		Object o1 = new String("T");
		StringBuffer sb2 = (StringBuffer) o1;

		// Example 2
		Object o2 = new String("T");
		// StringBuffer sb1 = (String) s; //Compile time error
//================================================================================================================================================================================
		// Point 3 Run time checking , run time object of type 'd' must be
		// either same or derived type of 'C'.
		// Otherwise we will get run time exception saying "Class Cast"

		// Example 1
		Object o3 = new String("T");
		StringBuffer sb3 = (StringBuffer) o3; //Run time exception 

		// Example 2
		Object o4 = new String("T");
		Object o5 = (String) o4;
//================================================================================================================================================================================

	}

}
