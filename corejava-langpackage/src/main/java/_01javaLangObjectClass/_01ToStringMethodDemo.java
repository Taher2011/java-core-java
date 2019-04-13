package _01javaLangObjectClass;

class Student {
	private String name;
	private int rollNumber;

	public Student(String name, int rollNumber) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	//Below method is default implementation of Object class toString method
	/*@Override
	public String toString() {
		return this.getClass().getName() + "@" + Integer.toHexString(hashCode());
	}*/
	
	/* toString method is used to get string representation of an object */
	@Override
	public String toString() {
		return "Student Name is " + name + " and Roll Number is " + rollNumber;
	}
	
}

public class _01ToStringMethodDemo {

	public static void main(String[] args) {
		Student s1 = new Student("Amar", 1);
		Student s2 = new Student("Bipin", 2);
		System.out.println(s1); //If we don't override toString() then Object class toString method will be called
		System.out.println(s2); //If we don't override toString() then Object class toString method will be called

	}

}
