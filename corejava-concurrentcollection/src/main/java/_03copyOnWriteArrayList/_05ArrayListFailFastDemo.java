package _03copyOnWriteArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

	private List<String> al;

	public Thread3(List<String> al) {
		super();
		this.al = al;
	}

	public void run() {
		System.out.println("Thread3 updating list");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		al.add("D");
	}

}

class Thread4 extends Thread {

	private List<String> al;

	public Thread4(List<String> al) {
		super();
		this.al = al;
	}

	public void run() {
		System.out.println("Thread4 updating list");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		al.add("E");
	}

}

public class _05ArrayListFailFastDemo {

	public static void main(String[] args) throws InterruptedException {
		List<String> al = new ArrayList<String>();
		al.add("A");
		al.add("B");
		al.add("C");
		Thread3 t3 = new Thread3(al);
		Thread4 t4 = new Thread4(al);
		t3.start();
		t4.start();
		Iterator<String> iterator = al.iterator();
		while (iterator.hasNext()) {
			System.out.println("Main thread iterating list");
			String elements = iterator.next();
			System.out.println("elements are " + elements);
			Thread.sleep(2000);
		}
		System.out.println("list is " + al);
	}

}
