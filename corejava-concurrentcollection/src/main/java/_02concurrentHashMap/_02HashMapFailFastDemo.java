package _02concurrentHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* Underlying DS is HashTable.
 * 
 * CHM allows concurrent read and thread safe update operations.
 * 
 * To perform read operation thread won't require any lock.
 * 
 * To perform update operation thread requires lock but is is
 * lock of only particular part(segment level).
 * 
 * Instead of whole map concurrent update achieved by dividing internally
 * map into smaller portion which is defined by concurrency level.
 * 
 * Default Concurrency level is 16.
 * 
 * CHM allows simultaneous read operations and simultaneously 16 write operations.
 * 
 * Null is not allowed for both keys and values.
 * 
 * While one thread iterating the other thread can perform update operation and
 * CHM never throw ConcurrentModifcationOperation.
 * */

/* Fail Fast Iterator :
 * 
 * If structural modification is detected then 
 * this iterator throws ConcurrentModificationException.
 * 
 * Structural modification includes addition, removal 
 * and updation of elements while collection is being
 * iterated.
 * 
 * Working :
 * 
 * Fail fast iterator maintain an internal flag called
 * "modCount".
 * 
 * "modCount" gets updated every time a collection is modified.
 * 
 * When next() of iterator is called to get next value, at the
 * same time it checks "modCount" flag. If this has been modified
 * after iterator has been created then it will throw
 * ConcurrentModificationException.
 */

class Thread4 extends Thread {
	private Map<String, String> hashMap;

	public Thread4(Map<String, String> hashMap) {
		super();
		this.hashMap = hashMap;
	}

	public void run() {
		System.out.println("Thread4 updating map");
		hashMap.put("4", "A");
	}

}

class Thread5 extends Thread {
	private Map<String, String> hashMap;

	public Thread5(Map<String, String> hashMap) {
		super();
		this.hashMap = hashMap;
	}

	public void run() {
		System.out.println("Thread5 updating map");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		hashMap.put("5", "B");
	}

}

class Thread6 extends Thread {
	private Map<String, String> hashMap;

	public Thread6(Map<String, String> hashMap) {
		super();
		this.hashMap = hashMap;
	}

	public void run() {
		System.out.println("Thread6 updating map");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		hashMap.put("6", "C");
	}

}

public class _02HashMapFailFastDemo {

	public static void main(String[] args) throws InterruptedException {
		Map<String, String> hashMap = new HashMap<String, String>();
		System.out.println("Main thread updating map");
		hashMap.put("0", "Z");
		hashMap.put("9", "Y");
		Thread4 t4 = new Thread4(hashMap);
		Thread5 t5 = new Thread5(hashMap);
		Thread6 t6 = new Thread6(hashMap);
		t4.start();
		t5.start();
		t6.start();
		Set<String> set = hashMap.keySet();
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println("Main thread iterating map");
			String key = iterator.next();
			System.out.println("Key is " + key);
			Thread.sleep(1000);
		}
	}

}
