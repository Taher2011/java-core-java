package _02immutableclass;

/*
 * Make your class final, so that no other classes can extend it.
 * Make all your fields final, so that they�re initialized only once inside the constructor and never modified afterward.
 * Don�t expose setter methods.
 * When exposing methods which modify the state of the class, you must always return a new instance of the class.
 * If the class holds a mutable object:
		Inside the constructor, make sure to use a clone copy of the passed argument and never set your mutable field to the real instance passed through constructor, 
		this is to prevent the clients who pass the object from modifying it afterwards.
        Make sure to always return a clone copy of the field and never return the real object instance.
        : Inside the constructor, return clone copy of the mutable field.
        : Form the getter method of mutable field return clone copy.
*/

final class ImmutableStudent2 {

	private final int id;
	private final String name;
	private final Age age; // Passing Mutable Objects to Immutable Class

	public ImmutableStudent2(int id, String name, Age age) {
		this.name = name;
		this.id = id;

		Age clonedAge = new Age();
		clonedAge.setDay(age.getDay());
		clonedAge.setMonth(age.getMonth());
		clonedAge.setYear(age.getYear());

		this.age = clonedAge;
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

public class _05CusotmImmutableClassCreationCase2Demo {

	public static void main(String[] args) {
		Age age = new Age();
		age.setDay(29);
		age.setMonth(1);
		age.setYear(1985);

		ImmutableStudent2 student = new ImmutableStudent2(1, "Taher", age);
		System.out.println("Taher age year before modification = " + student.getAge().getYear());

		age.setYear(1993);
		System.out.println("Taher age year after  modification = " + student.getAge().getYear());

		System.out.println();

		/*
		 * However, our class still has a leak and is not fully immutable, let's take
		 * the following test scenario:
		 */
		System.out.println("Taher age year before modification = " + student.getAge().getYear());
		student.getAge().setYear(1993);
		System.out.println("Taher age year after modification = " + student.getAge().getYear());
	}

}
