package _26priorityQueueClass;

import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.TreeSet;

class MyComparator implements Comparator {

	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}

/*
 * If we want to represent a group of individual objects prior to processing
 * according to some priority then we should go for PriorityQueue.
 * 
 * PriorityQueue can be default natural sorting order or customized sorting
 * order defined by Comparator.
 * 
 * Insertion order is not preserved and it is based on some priority.
 * 
 * Duplicate objects are not allowed.
 * 
 * If we are depending on DNSO then objects should be homogeneous and comparable
 * else get ClassCastException.
 * 
 * If we are defining on customized sorting then objects need not be homogeneous
 * and comparable.
 * 
 * Null is not allowed even as the first element.
 */

public class _01PriorityQueueConstructorsDemo {

	/*
	 * It creates empty PriorityQueue object with default initial capacity 11
	 * and all objects will be inserted according to default natural sorting
	 * order.
	 */
	PriorityQueue queue1 = new PriorityQueue();

	/*
	 * It creates empty PriorityQueue object with default initial capacity 20
	 * and all objects will be inserted according to default natural sorting
	 * order.
	 * 
	 * PriorityQueue queue2 = new PriorityQueue(int initailCapacity);
	 */
	PriorityQueue queue2 = new PriorityQueue(20);

	/*
	 * It creates empty PriorityQueue object with default initial capacity 20
	 * and all objects will be inserted according to customized sorting order.
	 * 
	 * PriorityQueue queue2 = new PriorityQueue(int initailCapacity, Comparator
	 * c);
	 */
	PriorityQueue queue3 = new PriorityQueue(20, new MyComparator());

	/*
	 * It creates equivalent PriorityQueue object for given SortedSet
	 * 
	 * PriorityQueue queue4 = new PriorityQueue(SortedSet s);
	 */
	PriorityQueue queue4 = new PriorityQueue(new TreeSet());

	/*
	 * It creates equivalent PriorityQueue object for given Collection
	 * 
	 * PriorityQueue queue5 = new PriorityQueue(Collection c);
	 */
	PriorityQueue queue5 = new PriorityQueue(new HashSet());

}
