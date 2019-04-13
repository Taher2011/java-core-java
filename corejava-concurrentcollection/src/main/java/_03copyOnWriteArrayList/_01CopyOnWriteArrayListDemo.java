package _03copyOnWriteArrayList;


/* It is thread safe version of AL as name indicates COWAL creates
 * a cloned copy of underlying AL for every update operation. At
 * certain point both will synchronized automatically by JVM internally.
 * 
 * As update operation will be performed on cloned copy, there is no effect
 * for the threads which performs read operation.
 * 
 * While one thread iterating COWAL object, the other threads are allowed to
 * modify and we won't get ConcurrentModificationException and iterator is
 * fail-safe.
 * 
 * Iterator of AL can perform remove operation but iterator of COWAL can't
 * perform remove operation else we will get UnSupportedException.
 * */

public class _01CopyOnWriteArrayListDemo {

	public static void main(String[] args) {

	}
}
