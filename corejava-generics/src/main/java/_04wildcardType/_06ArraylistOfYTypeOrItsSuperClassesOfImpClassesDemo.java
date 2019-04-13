package _04wildcardType;

import java.util.ArrayList;

interface State {

}

class District implements State {

}

class Tehsil extends District {

}

public class _06ArraylistOfYTypeOrItsSuperClassesOfImpClassesDemo {

	/*
	 * We can call this method by passing ArrayList of either Y type or super
	 * classes of its implemented classes objects. Within this method we can add
	 * objects.
	 */
	public static void m1(ArrayList<? super State> al) {
		System.out.println("ArrayList<? super City> al");
		al.add(new District()); // compile time error
		al.add(null);
	}

	public static void main(String[] args) {

		ArrayList<Object> aCity = new ArrayList<Object>();
		m1(aCity);

	}
}
