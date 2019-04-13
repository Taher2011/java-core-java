package _03copyOnWriteArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

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
 * When an iterator is created it makes copy of underlying
 * collection i.e snapshot.
 * 
 * It then iterates over snapshot and any changes to collection
 * doesn't get reflected in snapshot. So interference isn't possible
 * and it will never throw ConcurrentModificationException.
 * 
 * remove,add and set operations aren't supported by iterators for
 * CopyOnWriteArrayList and throws UnsupportedOperationException.
 */

class Thread1 extends Thread {

	private List<String> cowal;

	public Thread1(List<String> cowal) {
		super();
		this.cowal = cowal;
	}

	public void run() {
		System.out.println("Thread1 updating list");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		cowal.add("D");
	}

}

class Thread2 extends Thread {

	private List<String> cowal;

	public Thread2(List<String> cowal) {
		super();
		this.cowal = cowal;
	}

	public void run() {
		System.out.println("Thread2 updating list");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		cowal.add("E");
	}

}

public class _04CopyOnWriteArrayListFailSafeDemo {

	public static void main(String[] args) throws InterruptedException {
		List<String> cowal = new CopyOnWriteArrayList<String>();
		cowal.add("A");
		cowal.add("B");
		cowal.add("C");
		Thread1 t1 = new Thread1(cowal);
		Thread2 t2 = new Thread2(cowal);
		t1.start();
		t2.start();
		ListIterator<String> listIterator = cowal.listIterator();
		while (listIterator.hasNext()) {
			System.out.println("Main thread iterating list");
			String elements = listIterator.next();
			System.out.println("elements are " + elements);
			Thread.sleep(2000);
			// listIterator.remove(); //java.lang.UnsupportedOperationException
			// listIterator.add(""); //java.lang.UnsupportedOperationException
			// listIterator.set(""); // java.lang.UnsupportedOperationException
		}
		System.out.println("list is " + cowal);
	}

}
