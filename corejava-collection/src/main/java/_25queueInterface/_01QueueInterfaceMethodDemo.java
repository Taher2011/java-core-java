package _25queueInterface;

/* It is the child interface of Collection.
 * 
 * If we want to represent a group of individual objects
 * prior to processing then we should go for Queue.
 * 
 * Usually Queue follows FIFO order but based on our requirement
 * we can implement our own priority order also(Priority Queue).
 * 
 * LinkedList also implements Queue and follows FIFO order.
 * */

public class _01QueueInterfaceMethodDemo {

	/* to add object into the queue. */
	public boolean offer(Object o) {
		return false;
	}

	/*
	 * remove and returns the head element of the queue. if queue is empty it
	 * returns null
	 */
	public Object poll() {
		return null;
	}

	/*
	 * removes and returns the head element of the queue. if queue is empty it
	 * raises NoSuchElementException
	 */
	public Object remove() {
		return null;
	}

	/*
	 * returns the head element of the queue. if queue is empty it returns null
	 */
	public Object peek() {
		return null;
	}

	/*
	 * returns the head element of the queue. if queue is empty it raises
	 * NoSuchElementException
	 */
	public Object element() {
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
