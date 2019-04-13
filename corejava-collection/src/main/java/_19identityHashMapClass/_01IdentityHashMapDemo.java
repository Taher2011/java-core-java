package _19identityHashMapClass;

import java.util.HashMap;
import java.util.IdentityHashMap;

/* IdentityHashMap is the exactly same as HashMap 
 * including constructors and methods except ,
 * in normal HashMap jvm will use equals() to identify
 * duplicate keys which is meant for content comparison,
 * but in case of IdentityHashMap jvm will use == operator
 * to identify duplicate keys which is meant for reference comparison.
 */
public class _01IdentityHashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(new Integer(10), "A");
		hashMap.put(new Integer(10), "Z");
		System.out.println("hashMap is " + hashMap);

		System.out.println();

		IdentityHashMap<Integer, String> identityHashMap = new IdentityHashMap<Integer, String>();
		identityHashMap.put(new Integer(10), "A");
		identityHashMap.put(new Integer(10), "Z");
		System.out.println("identityHashMap is " + identityHashMap);
	}

}
