package _03copyOnWriteArrayList;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class _02CopyOnWriteArrayListConstructorDemo {

	CopyOnWriteArrayList<String> cowal1 = new CopyOnWriteArrayList<String>();
	
	/*CopyOnWriteArrayList<String> cowal2 = new CopyOnWriteArrayList<String>(Collection<String> collection);*/
	CopyOnWriteArrayList<String> cowal2 = new CopyOnWriteArrayList<String>(new ArrayList<String>());

	/*CopyOnWriteArrayList cowal3 = new CopyOnWriteArrayList(Object[] obj);*/
	String[] obj  = new String[0];
	CopyOnWriteArrayList<String> cowal3 = new CopyOnWriteArrayList<String>(obj);
	
	public static void main(String[] args) throws InterruptedException {

	}

}
