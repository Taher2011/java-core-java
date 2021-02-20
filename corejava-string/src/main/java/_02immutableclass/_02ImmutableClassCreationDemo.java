package _02immutableclass;

class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person personImmutable(Person person) {
		person = new Person(person.getId(), person.getName());
		person.id = 789;
		person.name = "XYZ";
		return person;
	}

	public String toString() {
		return id + " " + name;
	}
}

public class _02ImmutableClassCreationDemo {

	public static void main(String[] args) {
		Person p1 = new Person(123, "ABC");
		Person p2 = new Person(456, "DEF");

		System.out.println(p1);
		System.out.println(p2);

		p1.personImmutable(p2);
		System.out.println();

		System.out.println(p1);
		System.out.println(p2);
	}

}
