package _03arrayListClass;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * 
 * Underlying Data structure is Resizable or Growable Array
 *
 */
public class _01ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList<String> listCity = new ArrayList<String>();
		listCity.add("Indore");  // to add particular object
		listCity.add("Mumbai");
		listCity.add("Surat");
		listCity.add("Udaipur");
		
		ArrayList<String> listState = new ArrayList<String>();
		listState.add("MP");
		listState.add("MH");
		listState.add("GJ");
		listState.add("RJ");
		
		ArrayList<String> listCounty = new ArrayList<String>();
		listCounty.add("India");
		listCounty.add("Pak");
		listCounty.add("SL");
		listCounty.add("BNG");
		
		ArrayList<String> listCityStateAndCountry = new ArrayList<String>();
		listCityStateAndCountry.addAll(listCity);  // to add group of objects(collection)
		listCityStateAndCountry.addAll(listState);
		listCityStateAndCountry.addAll(listCounty);
		System.out.println(listCityStateAndCountry);
		System.out.println();
		
		listCityStateAndCountry.remove("MP");  // to remove particular object
		System.out.println(listCityStateAndCountry);
		System.out.println();
		
		listCityStateAndCountry.add(0, "TL");
		System.out.println(listCityStateAndCountry);
		System.out.println();
		
		listCityStateAndCountry.removeAll(listState);  // to remove group of objects(collection)
		System.out.println(listCityStateAndCountry);
		System.out.println();
		
		listCityStateAndCountry.retainAll(listCounty);  // to remove all group of objects(collection) except the specified argument being passed
		System.out.println(listCityStateAndCountry);
		System.out.println();
		
		listCityStateAndCountry.clear(); // to remove all group of objects(collection)
		System.out.println(listCityStateAndCountry); 
		System.out.println();
		
		listCityStateAndCountry.addAll(listCity);
		listCityStateAndCountry.addAll(listState);
		listCityStateAndCountry.addAll(listCounty);
		System.out.println(listCityStateAndCountry);
		System.out.println();
		
		System.out.println(listCityStateAndCountry.get(0)); // to get particular object from specified index
		System.out.println();
		
		System.out.println("removed " + listCityStateAndCountry.set(0, "AP")); // to set new object at specified index and it returns old object
		System.out.println(listCityStateAndCountry);
		System.out.println();
		
		System.out.println(listCityStateAndCountry.contains("MP"));  // to check list whether contains the specified element
		
		System.out.println(listCityStateAndCountry.containsAll(listCity));  // to check list whether contains the element of specified collection
		
		System.out.println(listCityStateAndCountry.isEmpty());  // to check whether list contains no elements.
		
		System.out.println();
		System.out.println("size is " + listCityStateAndCountry.size());  // Returns the number of elements in the list.
		
		System.out.println();
		
		Object[] arrayCountryStateAndCity = listCityStateAndCountry.toArray(); //Returns an array containing all of the elements in this list in proper sequence
		for (Object object : arrayCountryStateAndCity) {
			System.out.println(object);
		}
		
		System.out.println();
		
		Iterator<String> iterator = listCityStateAndCountry.iterator(); //Returns an iterator over the elements in this list in proper sequence.
		 // while loop
        while (iterator.hasNext()) {
        System.out.println("value = " + iterator.next());
        }
	}
}
