package _02concurrentHashMap;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class _03ConcurrentHashMapConstructorDemo {

	ConcurrentHashMap<String, String> chmp1 = new ConcurrentHashMap<String, String>();

	/*
	 * ConcurrentHashMap<String, String> chmp2 = new ConcurrentHashMap<String,String>(int initialCpacity);
	 */
	ConcurrentHashMap<String, String> chmp2 = new ConcurrentHashMap<String, String>(12);

	/*
	 * ConcurrentHashMap<String, String> chmp3 = new ConcurrentHashMap<String,String>(int initialCpacity, float fillRatio);
	 */
	ConcurrentHashMap<String, String> chmp3 = new ConcurrentHashMap<String, String>(12, 0.95f);

	/*
	 * ConcurrentHashMap<String, String> chmp4 = new ConcurrentHashMap<String,String>(int initialCpacity, float fillRatio, int concurrencyLevel);
	 */
	ConcurrentHashMap<String, String> chmp4 = new ConcurrentHashMap<String, String>(12, 0.95f, 18);
	
	/*
	 * ConcurrentHashMap<String, String> chmp5 = new ConcurrentHashMap<String,String>(Map map);
	 */
	ConcurrentHashMap<String, String> chmp5 = new ConcurrentHashMap<String, String>(new HashMap<String, String>());

	public static void main(String[] args) throws InterruptedException {

	}

}
