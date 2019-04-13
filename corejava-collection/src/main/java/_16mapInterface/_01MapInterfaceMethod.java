package _16mapInterface;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* Map is used to represent a group of objects a key-value pair.
 * Both key and value are objects.
 * Each key value pair is called Entry.
 * */
public class _01MapInterfaceMethod {

	/*
	 * To add key-value pair to the map. If the key is already present then old
	 * value will be replaced with new value and returns old value. If the key
	 * is already not present then returns null.
	 */
	public Object put(Object key, Object value) {
		return null;
	}

	/*
	 * To add group of key-value pair to the map.
	 */
	public void putAll(Map map) {

	}

	/*
	 * To get particular value for the corresponding key if we know the key.
	 */
	public Object get(Object key) {
		return null;
	}

	/*
	 * removes particular key-value pair from the map. If key does not exist the
	 * it returns.null
	 */
	public Object remove(Object key) {
		return null;
	}

	/*
	 * returns the size of map.
	 */
	public int size() {
		return 0;
	}

	/*
	 * checks whether map is empty or not.
	 */
	public boolean isEmpty() {
		return false;
	}

	/*
	 * deletes all key-value pairs from the map.
	 */
	public void clear() {

	}

	/*
	 * check whether provided key exists or not.
	 */
	public boolean containsKey(Object key) {
		return false;
	}

	/*
	 * check whether provided value exists or not.
	 */
	public boolean containsValue(Object value) {
		return false;
	}

	/*
	 * returns the keys from map.
	 */
	public Set keySet() {
		return null;
	}

	/*
	 * returns the values from map.
	 */
	public Collection values() {
		return null;
	}

	/*
	 * returns the key-value pairs from map.
	 */
	public Set entrySet() {
		return null;
	}

	/*
	 * returns the key from entry object.
	 */
	public Object getKey() {
		return null;
	}

	/*
	 * returns the value from entry object.
	 */
	public Object getValue() {
		return null;
	}

	/*
	 * returns the old value.
	 */
	public Object setValue(Object newValue) {
		return null;
	}

	public static void main(String[] args) {
	}

}
