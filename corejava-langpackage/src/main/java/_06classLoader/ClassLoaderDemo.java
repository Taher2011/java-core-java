package _06classLoader;

public class ClassLoaderDemo {

	public static void main(String[] args) {
		System.out.println(Customer.class.getClassLoader());
		System.out.println(Student.class.getClassLoader());
		
	}

}
