package _04copyOnWriteArraySet;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class _02CopyOnWriteArraySetConstructorDemo {

	CopyOnWriteArraySet<String> cowas1 = new CopyOnWriteArraySet<String>();
	
	/*CopyOnWriteArraySet<String> cowas2 = new CopyOnWriteArraySet<String>(Collection<String> collection);*/
	CopyOnWriteArraySet<String> cowas2 = new CopyOnWriteArraySet<String>(new ArrayList<String>());

	
	public static void main(String[] args) throws InterruptedException {

	}

}
