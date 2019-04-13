package _01concurrentCollections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* Traditional collection like ArrayList,HashSet can be accessed
 * by multiple threads simultaneously and there may be chance of
 * data inconsistency.
 * 
 * Already existing thread safe collection like Vector, SynchronizedList,
 * SynchronizedSet are not up to the mark with respect to performance.
 * 
 * Because for every operation even for read operation also total collection
 * object will be locked by one thread at a time and it increases waiting
 * time for other threads.
 * 
 * Another big problems with traditional collection is while one thread 
 * iterating collection the other threads aren't allowed to modify collection
 * object simultaneously, if we are trying to modify then we will get 
 * "ConcurrnetModificationException".
 * 
 * Hence traditional collection object aren't suitable for multi threaded app.
 * To overcome these concurrent collections introduced.
 * 
 * 1) Concurrent collections are always thread safe.
 * 2) Concurrent collections are good at performance because of different locking mechanisms.
 * 3) While one thread iterating collection, the other threads are allowed to modify collection is safe manner.
 * 4) Hence Concurrent collection never throw "ConcurrnetModificationException"
 * */

public class _01ConcurrentCollectionBasicDemo {

	public static void main(String[] args) {
		Map<String, String> map = new ConcurrentHashMap<String, String>();
		System.out.println(map.put("Taher", "Aly"));
		System.out.println(map.putIfAbsent("Taher", "Ali"));
		System.out.println(map);
	}
}
