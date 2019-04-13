package _15comparatorInterface;

/* Comparator is present in java.util package and it contains only two method compare() and equals().
 * Comparator is meant for customized sorting order.
 * We are not required to implement equals() 
 * because it is already available to our class from Object class through inheritance.
 */

public class _01ComparatorInterfaceMethod {

	public int compare(Object object1, Object object2) {
		// return -1, if object1 has to come before object2
		// return +1, if object1 has to come after object2
		// return 0, if object1 == object2

		// Note : object1 is the object which is to be inserted and object2 is
		// the object which is already inserted.

		return 0;
	}

	public static void main(String[] args) {

	}

}
