package _28arraysClass;

import java.util.ArrayList;

class City {

	private String cityName;

	public City(String cityName) {
		super();
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return cityName;
	}

}

public class _08ListToArrayDemo {

	public static void main(String[] args) {

		ArrayList<City> list = new ArrayList<City>();
		list.add(new City("Indore"));
		list.add(new City("Pune"));
		list.add(new City("Mumbai"));
		list.add(new City("Surat"));

		System.out.println(list);

		Object[] objArray = list.toArray();
		for (Object object : objArray) {
			String s1 = object.toString();
			System.out.println(s1);
		}

	}

}
