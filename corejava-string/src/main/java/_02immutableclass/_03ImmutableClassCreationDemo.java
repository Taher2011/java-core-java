package _02immutableclass;

class Student {

	int id;

	public Student(int id) {
		super();
		this.id = id;
	}

	public Student modifyStudent(int id) {
		if (this.id == id) {
			return this;
		} else {
			return new Student(id);
		}
	}
}

public class _03ImmutableClassCreationDemo {

	public static void main(String[] args) {
		Student student1 = new Student(10);
		Student student2 = student1.modifyStudent(100);
		Student student3 = student1.modifyStudent(10);

		System.out.println("student1 == student2 " + (student1 == student2));
		System.out.println("student1 == student3 " + (student1 == student3));
	}

}
