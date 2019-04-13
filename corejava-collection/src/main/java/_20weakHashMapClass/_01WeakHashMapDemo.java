package _20weakHashMapClass;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* WeakHashMap is the exactly same as HashMap 
 * including constructors and methods except ,
 * 
 * In the case of HashMap even though object
 * doesn't have any reference, it is not eligible for GC,
 * even though object is associated with HashMap.
 * 
 * In the case of WeakHashMap if object
 * doesn't have any reference, it is eligible for GC,
 * even though object is associated with WeakHashMap.
 */

class Account {

	public String toString() {
		return "account";
	}

	public void finalize() {
		System.out.println("finalize method called");
	}
}

public class _01WeakHashMapDemo {

	public static void main(String[] args) throws Exception {
		// case 1
		Account account = new Account();
		System.out.println(account);
		account = null;
		System.gc();
		Thread.sleep(1000);
		System.out.println(account);

		System.out.println();

		// case 2 for HashMap
		Account accountHashMap = new Account();
		HashMap<Account, String> hashMap = new HashMap<Account, String>();
		hashMap.put(accountHashMap, "HashMap");
		System.out.println(accountHashMap);
		System.out.println(hashMap);
		accountHashMap = null;
		System.gc();
		Thread.sleep(1000);
		System.out.println(accountHashMap);
		System.out.println(hashMap);

		System.out.println();

		// case 3 for WeakHashMap
		Account accountWeakHashMap = new Account();
		WeakHashMap<Account, String> weakHashMap = new WeakHashMap<Account, String>();
		weakHashMap.put(accountWeakHashMap, "WeakHashMap");
		System.out.println(accountWeakHashMap);
		System.out.println(weakHashMap);
		accountWeakHashMap = null;
		System.gc();
		Thread.sleep(1000);
		System.out.println(accountWeakHashMap);
		System.out.println(weakHashMap);
	}

}
