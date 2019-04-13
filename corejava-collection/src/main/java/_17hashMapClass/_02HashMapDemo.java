package _17hashMapClass;

import java.util.HashMap;
import java.util.Map;

/* Underlying DS is Hashtable.
 * Insertion order is not preserved based on hashcode of the key.
 * Duplicate keys are not allowed(only once) but values can be null.
 * HashMap use equals() to identify duplicate keys.
 * Heterogeneous objects are allowed.
 * Hashmap implements Serializable and Cloneable.
 * HashMap is best choice for search operations.
 */

public class _02HashMapDemo {

	public static void main(String[] args) {

		Map<Integer, String> cityMap = new HashMap<Integer, String>();
		System.out.println(cityMap.put(1, "Delhi")); // To add key-value pair to
														// the map. If the key
														// is already present
														// then old value will
														// be replaced with new
														// value and returns old
														// value. If the key is
														// already not present
														// then returns null.
		System.out.println(cityMap.put(2, "Bombay"));
		System.out.println(cityMap.put(3, "Calcutta"));
		System.out.println(cityMap.put(1, "Ahemadabad"));
		System.out.println();
		System.out.println("City Map " + cityMap);
		System.out.println();

		Map<Integer, String> stateMap = new HashMap<Integer, String>();
		System.out.println(stateMap.put(4, "MP"));
		System.out.println(stateMap.put(5, "AP"));
		System.out.println(stateMap.put(6, "UP"));
		System.out.println();
		System.out.println("State Map " + stateMap);
		System.out.println();

		Map<Integer, String> countryMap = new HashMap<Integer, String>();
		System.out.println(countryMap.put(7, "India"));
		System.out.println(countryMap.put(8, "Pak"));
		System.out.println(countryMap.put(9, "SL"));
		System.out.println();
		System.out.println("City Map " + countryMap);
		System.out.println();

		Map<Integer, String> cityStateCountryMap = new HashMap<Integer, String>();
		cityStateCountryMap.putAll(cityMap);// To add group of key-value pair to
											// the map.
		cityStateCountryMap.putAll(stateMap);
		cityStateCountryMap.putAll(countryMap);
		System.out.println("City State Country Map" + cityStateCountryMap);
		System.out.println();

		System.out.println(cityStateCountryMap.get(5)); // To get particular
														// value for the
														// corresponding key if
														// we know the key.
		System.out.println();
		System.out.println(cityMap.remove(1));// removes particular key-value
												// pair from the map. If key
												// does not exist the it returns
												// null
		System.out.println();
		System.out.println(cityMap);
		System.out.println(cityStateCountryMap);

		System.out.println();
		System.out.println(cityStateCountryMap.containsKey(1)); // check whether
																// provided key
																// exists or
																// not.
		System.out.println(cityStateCountryMap.containsValue("Delhi")); // check
																		// whether
		// provided key
		// exists or
		// not.
		// cityStateCountryMap.clear(); //deletes all key-value pairs from the
		// map.
		// System.out.println(cityStateCountryMap);

		System.out.println();
		System.out.println(cityStateCountryMap.isEmpty()); // checks whether map
															// is empty or not.

		System.out.println();
		System.out.println(cityStateCountryMap.size()); // returns the size of
														// map

		System.out.println();
		System.out.println(cityStateCountryMap.keySet()); // returns the keys
															// from map.
		System.out.println(cityStateCountryMap.values()); // returns the values
															// from map.
		System.out.println(cityStateCountryMap.entrySet()); // returns the
															// key-values from
															// map.

	}
}
