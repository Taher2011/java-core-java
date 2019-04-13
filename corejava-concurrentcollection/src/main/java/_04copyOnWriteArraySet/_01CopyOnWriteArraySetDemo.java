package _04copyOnWriteArraySet;

/* It is thread safe version of Set as name indicates COWAS creates
 * a cloned copy of underlying Set for every update operation. At
 * certain point both will synchronized automatically by JVM internally.
 * 
 * Internally implemented by COWAL so insertion order is preserved.
 * 
 * Duplicates aren't allowed.
 * 
 * As update operation will be performed on cloned copy, there is no effect
 * for the threads which performs read operation.
 * 
 * While one thread iterating COWAS object, the other threads are allowed to
 * modify and we won't get ConcurrentModificationException and iterator is
 * fail-safe.
 * 
 * Iterator of HashSset can perform remove operation but iterator of COWAS can't
 * perform remove operation else we will get UnSupportedException.
 * */

public class _01CopyOnWriteArraySetDemo {

	public static void main(String[] args) {

	}
}
