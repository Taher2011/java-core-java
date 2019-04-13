package _17hashMapClass;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class _03HashMapConstructorDemo {

	public static void main(String[] args) {

		/*Fill Ratio : After filling how much ratio, a new hashMap object will
		be created. This ratio is called Fill Ratio/Load Factor.*/

		/*
		 * It creates empty HM object with default initial capacity 16 and
		 * default fill ratio 0.75. Once HM reaches it 75% capacity then a new
		 * HM object will be created.
		 */
		HashMap map1 = new HashMap();

		/*
		 * It creates empty HM object with specified initial capacity and
		 * default fill ratio 0.75.
		 *  HashMap set2 = new HashMap(int initialCapacity);
		 */
		HashMap map2 = new HashMap(20);

		/*
		 * It creates empty HM object with specified initial capacity and fill
		 * ratio.
		 * HashMap set3 = new HashMap(int initialCapacity, floatfillRatio);
		 */
		HashMap map3 = new HashMap(20, 0.90f);

		/*
		 * It creates equivalent HM object for given Map
		 *  HashMap map4 = new HashMap(Map m);
		 */
		Map map = new TreeMap();
		map.put(1, "A");
		map.put(2, "B");
		System.out.println("Map is " + map);
		HashMap map4 = new HashMap(map);
		System.out.println("equivalent HashMap is " + map4);

	}

}
