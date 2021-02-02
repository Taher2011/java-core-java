package _04wildcardType;

import java.util.ArrayList;

class Continent {

}

class Country extends Continent {

}

class Cities extends Country {

}

class Villages extends Cities {

}

public class _05ArraylistOfXTypeOrItsSuperClassesDemo {

	/*
	 * We can call this method by passing ArrayList of either X type or its
	 * super classes objects. Within this method we can not add objects because
	 * we don't know the type exactly except null.
	 */
	public static void m1(ArrayList<? super Cities> al) {
		System.out.println("ArrayList<? super City> al");
		// al.add(new City()); //compile time error
		al.add(null);
	}

	public static void main(String[] args) {

		ArrayList<Cities> aCity = new ArrayList<Cities>();
		m1(aCity);

		ArrayList<Country> aCountry = new ArrayList<Country>();
		m1(aCountry);

		ArrayList<Continent> aContinent = new ArrayList<Continent>();
		m1(aContinent);
		
		ArrayList<Villages> aVillage = new ArrayList<Villages>();
		//m1(aVillage); compile error as we cannot add child of Cities
	}
}
