package _22treeMapClass;

import java.util.HashMap;
import java.util.TreeMap;

public class _02TreeMapConstructorDemo {

	public static void main(String[] args) {

		/*
		 * It creates empty MP object where the elements will be inserted
		 * according to default natural sorting order.
		 */
		TreeMap map1 = new TreeMap();

		/*
		 * It creates empty TreeMap object where the elements will be inserted
		 * according to custom sorting order specified by comparator object.
		 * TreeMap map1 = new TreeMap(Comparator c);
		 */

		/*
		 * It creates equivalent TreeMap object for given Map 
		 * TreeMap map3 = new TreeMap(Map m);
		 */
		HashMap map = new HashMap();
		map.put(1, 1);
		// map.put("1", 1); //java.lang.ClassCastException:
		map.put(2, 2);
		System.out.println("map is " + map);
		TreeMap tmap = new TreeMap(map);
		System.out.println("equivalent TreeMap is " + tmap);

		/*
		 * It creates equivalent TreeMap object for given SortedMap
		 * TreeMap map4= new TreeMap(SortedMap c);
		 */

	}
}
