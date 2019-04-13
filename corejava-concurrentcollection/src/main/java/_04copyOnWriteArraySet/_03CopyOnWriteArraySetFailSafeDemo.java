package _04copyOnWriteArraySet;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

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
 * CopyOnWriteArraySet and throws UnsupportedOperationException.
 */

class Thread1 extends Thread {

	private Set<String> cowas;

	public Thread1(Set<String> cowas) {
		super();
		this.cowas = cowas;
	}

	public void run() {
		System.out.println("Thread1 updating set");
		try {
		} catch (Exception e) {
		}
		cowas.add("D");
	}

}

class Thread2 extends Thread {

	private Set<String> cowas;

	public Thread2(Set<String> cowas) {
		super();
		this.cowas = cowas;
	}

	public void run() {
		System.out.println("Thread2 updating set");
		try {
		} catch (Exception e) {
		}
		cowas.add("E");
	}

}

public class _03CopyOnWriteArraySetFailSafeDemo {

	public static void main(String[] args) throws InterruptedException {
		Set<String> cowas = new CopyOnWriteArraySet<String>();
		cowas.add("A");
		cowas.add("B");
		cowas.add("C");
		Thread1 t1 = new Thread1(cowas);
		Thread2 t2 = new Thread2(cowas);
		t1.start();
		t2.start();
		Iterator<String> iterator = cowas.iterator();
		while (iterator.hasNext()) {
			System.out.println("Main thread iterating set");
			String elements = iterator.next();
			System.out.println("elements are " + elements);
		}
		System.out.println("list is " + cowas);
	}

}
