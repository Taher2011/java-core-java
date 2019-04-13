package _23hashtableClass;

import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class _02HashTableConstructorsDemo {

	public static void main(String[] args) {

		/*
		 * Fill Ratio : After filling how much ratio, a new hashTable object
		 * will be created. This ratio is called Fill Ratio/Load Factor.
		 */

		/*
		 * It creates empty HT object with default initial capacity 11 and
		 * default fill ratio 0.75. Once HT reaches it 75% capacity then a new
		 * HM object will be created.
		 */
		Hashtable map1 = new Hashtable();

		/*
		 * It creates empty HT object with specified initial capacity and
		 * default fill ratio 0.75.
		 * Hashtable map1 = new Hashtable(int initialCapacity);
		 */
		Hashtable map2 = new Hashtable(20);

		/*
		 * It creates empty HT object with specified initial capacity and fill
		 * ratio.
		 * Hashtable map3 = new Hashtable(int initialCapacity, float fillRatio);
		 */
		Hashtable map3 = new Hashtable(20, 0.90f);

		/*
		 * It creates equivalent HT object for given Map Hashtable map4 = new
		 * Hashtable(Map m);
		 */
		Map map = new TreeMap();
		map.put(1, "A");
		map.put(2, "B");
		System.out.println("Map is " + map);
		Hashtable map4 = new Hashtable(map);
		System.out.println("equivalent Hashtable is " + map4);

	}

}
