package _01concurrentCollections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class _02ConcurrentCollectionSpecificMethodDemo {

	/*
	 * If the key is already present then entry won't be added and returns old
	 * associated value. If key is not present then only entry will be added.
	 */
	public Object putIfAbsent(Object key, Object value) {
		return null;
	}

	/*
	 * Removes the key if the key associated with specified value only.
	 */
	public boolean remove(Object key, Object value) {
		return false;
	}

	/*
	 * It replaces only if specified old value is associated with key.
	 */
	public boolean replace(Object key, Object oldValue, Object newValue) {
		return false;
	}

	public static void main(String[] args) {
		Map<String, String> map = new ConcurrentHashMap<String, String>();
		System.out.println(map.putIfAbsent("Taheri", "Ali"));
		System.out.println(map.putIfAbsent("Taher", "Aly"));
		System.out.println(map.putIfAbsent("Taher", "Alee"));
		System.out.println(map);

		System.out.println();

		System.out.println(map.remove("Taher", "Alii"));

		System.out.println();

		System.out.println(map.replace("Taher", "Aly", "Ali"));
		
		System.out.println();
		
		System.out.println(map);

	}
}
