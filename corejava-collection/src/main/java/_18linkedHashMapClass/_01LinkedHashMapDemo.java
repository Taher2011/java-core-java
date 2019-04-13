package _18linkedHashMapClass;

import java.util.LinkedHashMap;

/* LinkedHashMap is the child class of HashMap.
 * It is exactly same as HashMap including constructors and methods
 * except , underlying data structure is LinkedList and Hashtable,
 * insertion order is preserved.
 * */
public class _01LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
		linkedHashMap.put("1", "A");
		linkedHashMap.put("3", "W");
		linkedHashMap.put("6", "F");
		linkedHashMap.put("9", "G");
		System.out.println(linkedHashMap);

	}

}
