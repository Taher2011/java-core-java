package _10hashSetClass;

import java.util.ArrayList;
import java.util.HashSet;

public class _02HashSetConstructorDemo {

	public static void main(String[] args) {

		/*
		 * Fill Ratio : After filling how much ratio, a new hashset object will
		 * be created. This ratio is called Fill Ratio/Load Factor.
		 */

		/*
		 * It creates empty HS object with default initial capacity 16 and
		 * default fill ratio 0.75. Once HS reaches it 75% capacity then a new
		 * HS object will be created.
		 */
		HashSet set1 = new HashSet();

		/*
		 * It creates empty HS object with specified initial capacity and
		 * default fill ratio 0.75. 
		 * HashSet set2 = new HashSet(int initialCapacity);
		 */
		HashSet set2 = new HashSet(20);

		/*
		 * It creates equivalent HS object for given Collection
		 *  HashSet set3 = new HashSet(Collection c);
		 */
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(1);
		System.out.println("List is " + list);
		HashSet set3 = new HashSet(list);
		System.out.println("equivalent HashSet is " + set3);

	}

}
