package _04linkedListClass;

import java.util.LinkedList;

public class _02LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> listCity = new LinkedList<String>();
		listCity.add("Indore");
		listCity.add("Hydreabad");
		listCity.add("Pune");
		listCity.add("Surat");
		System.out.println(listCity);
		System.out.println();
		
		listCity.addFirst("Mumbai");
		System.out.println(listCity);
		System.out.println();

		listCity.addLast("Delhi");
		System.out.println(listCity);
		System.out.println();

		System.out.println(listCity.getFirst());
		System.out.println();

		System.out.println(listCity.getLast());
		System.out.println();

		System.out.println("removed " + listCity.removeFirst());
		System.out.println(listCity);
		System.out.println();

		System.out.println("removed " + listCity.removeLast());
		System.out.println(listCity);
		System.out.println();
	}

}
