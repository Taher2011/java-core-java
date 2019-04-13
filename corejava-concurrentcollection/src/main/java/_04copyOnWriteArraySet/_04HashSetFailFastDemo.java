package _04copyOnWriteArraySet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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

class Thread3 extends Thread {

	private Set<String> hs;

	public Thread3(Set<String> hs) {
		super();
		this.hs = hs;
	}

	public void run() {
		System.out.println("Thread3 updating set");
		try {
		} catch (Exception e) {
		}
		hs.add("D");
	}

}

class Thread4 extends Thread {

	private Set<String> hs;

	public Thread4(Set<String> hs) {
		super();
		this.hs = hs;
	}

	public void run() {
		System.out.println("Thread4 updating set");
		try {
		} catch (Exception e) {
		}
		hs.add("E");
	}

}

public class _04HashSetFailFastDemo {

	public static void main(String[] args) throws InterruptedException {
		Set<String> hs = new HashSet<String>();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		Thread3 t3 = new Thread3(hs);
		Thread4 t4 = new Thread4(hs);
		t3.start();
		t4.start();
		Iterator<String> iterator = hs.iterator();
		while (iterator.hasNext()) {
			System.out.println("Main thread iterating set");
			String elements = iterator.next();
			System.out.println("elements are " + elements);
		}
		System.out.println("list is " + hs);
	}

}
