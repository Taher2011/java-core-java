package _17hashMapClass;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class City {

	private Integer cityId;
	private String cityName;

	public City(Integer cityId, String cityName) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "" + cityId + " " + cityName;
	}

}

public class _04HashMapIteratorDemo {

	public static void main(String[] args) {
		Map<City, String> cityMap = new HashMap<City, String>();
		cityMap.put(new City(1, "Delhi"), "D");
		cityMap.put(new City(2, "Bombay"), "B");
		cityMap.put(new City(3, "Calcutta"), "C");
		cityMap.put(new City(4, "Ahemadabad"), "A");
		System.out.println();
		System.out.println("City Map " + cityMap);
		System.out.println();

		Set<Entry<City, String>> set = cityMap.entrySet();

		Iterator<Entry<City, String>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry<City, String> cityItr = (Map.Entry<City, String>) iterator.next();
			System.out.println("Keys are " + cityItr.getKey() + " and Values are " + cityItr.getValue());
			
			if(cityItr.getKey().toString().equals("2 Bombay")) {
				cityItr.setValue("M");
			}
		}
		System.out.println(cityMap);
	}

}
