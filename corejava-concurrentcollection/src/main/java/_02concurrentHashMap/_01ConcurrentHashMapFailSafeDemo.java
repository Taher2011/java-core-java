package _02concurrentHashMap;

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

/* Fail Safe Iterator :
 * 
 * If structural modification is detected then 
 * this iterator doesn't throws ConcurrentModificationException.
 * 
 * Structural modification done on actual collections got
 * unnoticed by iterators.
 * 
 * So while iterating up-to-date data isn't guaranteed.
 * 
 * Working :
 * 
 * In case of CHM it doesn't work on separate copy unlike COWAL
 * although it is fail safe.
 * 
 * It is called weakly consistent means it can tolerate concurrent 
 * modification traversing and may reflect(but not guaranteed)
 * concurrent modification. 
 */

class Thread1 extends Thread {
	private Map<String, String> conHashMap;

	public Thread1(Map<String, String> conHashMap) {
		super();
		this.conHashMap = conHashMap;
	}

	public void run() {
		System.out.println("Thread1 updating map");
		conHashMap.put("1", "A");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class Thread2 extends Thread {
	private Map<String, String> conHashMap;

	public Thread2(Map<String, String> conHashMap) {
		super();
		this.conHashMap = conHashMap;
	}

	public void run() {
		System.out.println("Thread2 updating map");
		conHashMap.put("2", "B");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class Thread3 extends Thread {
	private Map<String, String> conHashMap;

	public Thread3(Map<String, String> conHashMap) {
		super();
		this.conHashMap = conHashMap;
	}

	public void run() {
		System.out.println("Thread3 updating map");
		conHashMap.put("3", "C");
	}

}

public class _01ConcurrentHashMapFailSafeDemo {

	public static void main(String[] args) throws InterruptedException {
		Map<String, String> conHashMap = new ConcurrentHashMap<String, String>();
		System.out.println("Main thread updating map");
		conHashMap.put("0", "Z");
		Thread1 t1 = new Thread1(conHashMap);
		Thread2 t2 = new Thread2(conHashMap);
		Thread3 t3 = new Thread3(conHashMap);
		t1.start();
		t2.start();
		t3.start();
		Set<String> set = conHashMap.keySet();
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println("Main thread iterating map");
			String key = iterator.next();
			System.out.println("Key is " + key);
			Thread.sleep(100);
		}
	}

}
