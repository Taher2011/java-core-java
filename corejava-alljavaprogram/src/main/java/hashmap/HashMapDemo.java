package hashmap;

import java.util.HashMap;
import java.util.Map;

class Person {
	private int perId;
	private static int equal;
	private static int hashC;
	
	public Person(int perId) {
		super();
		this.perId = perId;
	}

	public int getPerId() {
		return perId;
	}

	public boolean equals(Object obj) {
		System.out.println("equals called " + ++equal + " times");
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (obj instanceof Person) {
			Person person = (Person) obj;
			if (this.getPerId() == person.getPerId()) {
				return true;
			}
		}
		return false;
	}

	public int hashCode() {
		System.out.println("hashCode called " + ++hashC + " times");
		return perId;
	}

	@Override
	public String toString() {
		return perId + "";
	}

}

public class HashMapDemo {

	public static void main(String[] args) {
		Person p1 = new Person(15);
		Person p2 = new Person(34);
		Person p3 = new Person(24);
		Person p4 = new Person(34);
		Person p5 = new Person(15);

		Map<Person, String> perMap = new HashMap<>();
		perMap.put(p1, "Ind");
		perMap.put(p2, "Pak");
		perMap.put(p3, "Sri");
		perMap.put(p4, "Afg");
		perMap.put(p5, "Ban");

		System.out.println();
		System.out.println("Hash Map " + perMap);
		
		System.out.println();
		System.out.println("value for key  " + perMap.get(p1));

	}

}
