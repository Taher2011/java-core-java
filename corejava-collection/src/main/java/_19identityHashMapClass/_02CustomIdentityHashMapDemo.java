package _19identityHashMapClass;

import java.util.IdentityHashMap;

class Person {

	private int personid;
	private String personName;

	public Person(int personid, String personName) {
		super();
		this.personid = personid;
		this.personName = personName;
	}

	/*
	 * hashCode() get called every time when object is being inserted into
	 * HashMap.
	 */
	public int hashCode() {
		return personName.hashCode() + personid;
	}

	/*
	 * equals() get called only when two objects having the same hashCode.
	 * equals() is used to check the duplicates based on the contents.
	 */
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (obj instanceof Person) {
			Person p = (Person) obj;
			if ((this.personid == p.personid)
					&& this.personName.equals(p.personName)) {
				return true;
			}
		}
		return false;
	}

	public String toString() {
		return "" + personid + " " + personName + " ";
	}
}

public class _02CustomIdentityHashMapDemo {

	public static void main(String[] args) {
		Person p1 = new Person(12, "AB");
		Person p2 = new Person(34, "CD");
		Person p3 = new Person(56, "EF");
		Person p4 = new Person(12, "AB");

		IdentityHashMap<Person, String> identityHashMap = new IdentityHashMap<Person, String>();
		identityHashMap.put(p1, "1");
		identityHashMap.put(p1, "4");
		identityHashMap.put(p2, "2");
		identityHashMap.put(p3, "3");

		System.out.println(identityHashMap);
	}

}
