package _04wildcardType;

import java.util.ArrayList;

class City {

}

public class _02ArraylistOfAnyTypeDemo {

	/*
	 * We can call this method by passing ArrayList of any type objects. Within this
	 * method we can not add objects because we don't know the type exactly except
	 * null.
	 */
	public static void m1(ArrayList<?> al) {
		System.out.println("ArrayList<?> al");
		// al.add("A"); //compile time error
		al.add(null);
	}

	public static void main(String[] args) {

		ArrayList<String> listString = new ArrayList<>();
		listString.add("");
		m1(listString);

		ArrayList<Integer> listInteger = new ArrayList<>();
		listInteger.add(0);
		m1(listInteger);

		ArrayList<City> listCity = new ArrayList<>();
		listCity.add(new City());
		m1(listCity);

	}
}
