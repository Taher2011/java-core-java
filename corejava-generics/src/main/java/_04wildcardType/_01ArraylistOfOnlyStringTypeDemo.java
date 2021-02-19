package _04wildcardType;

import java.util.ArrayList;

public class _01ArraylistOfOnlyStringTypeDemo {

	/*
	 * We can call this method by passing ArrayList of only String type objects.
	 * Within this method we can add only string type of objects but if we try to
	 * add other than String type objects we get compile time error.
	 */
	public static void m1(ArrayList<String> al) {
		System.out.println("ArrayList<String> al");
		al.add("A");
		al.add("X");
		// al.add(2);
	}

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		m1(al);
	}
}
