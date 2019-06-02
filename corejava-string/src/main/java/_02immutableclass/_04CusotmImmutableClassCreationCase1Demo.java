package _02immutableclass;

/*
 * Make your class final, so that no other classes can extend it.
 * Make all your fields final, so that they’re initialized only once inside the constructor and never modified afterward.
 * Don’t expose setter methods.
 * When exposing methods which modify the state of the class, you must always return a new instance of the class.
 * If the class holds a mutable object:
		Inside the constructor, make sure to use a clone copy of the passed argument and never set your mutable field to the real instance passed through constructor, 
		this is to prevent the clients who pass the object from modifying it afterwards.
        Make sure to always return a clone copy of the field and never return the real object instance.
*/

final class ImmutableStudent1 {

	private final int id;
	private final String name;
	private final Age age; // Passing Mutable Objects to Immutable Class

	public ImmutableStudent1(int id, String name, Age age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Age getAge() {
		return age;
	}
}

public class _04CusotmImmutableClassCreationCase1Demo {

	public static void main(String[] args) {
		// Let’s create a simple test class and verify that ImmutableStudent1 is no more immutable:
		Age age = new Age();
		age.setDay(29);
		age.setMonth(1);
		age.setYear(1985);

		ImmutableStudent1 student = new ImmutableStudent1(1, "Taher", age);
		System.out.println("Taher age year before modification = " + student.getAge().getYear());

		age.setYear(1993);
		System.out.println("Taher age year after  modification = " + student.getAge().getYear());
	}

}
