package _05classDotForNameMethod;

abstract class AbstractNewInstance {

	static {
		System.out.println("static block of AbstractNewInstance class loaded");
	}

}

class LoadNewInstance {

	static {
		System.out.println("static block of LoadNewInstance class loaded");
	}

	{
		System.out.println("instance block of LoadNewInstance class loaded");
	}

	public void load() {
		System.out.println("load method");
	}

}

/*
 * The newInstance() method of Class class is used to create a new instance of
 * the class dynamically.
 * 
 * Class.forName() is used in loading the class dynamically and we will be using
 * newInstance() method to create object dynamically.
 * 
 * The newInstance() method of Class class can invoke only no-arg constructor of
 * the class.
 */
public class _02NewInstanceMethodDemo {

	public static void main(String[] args) throws Exception {

		@SuppressWarnings("unchecked")
		Class<LoadNewInstance> class1 = (Class<LoadNewInstance>) Class
				.forName("_05classDotForNameMethod.LoadNewInstance");

		class1.newInstance().load(); // throws IllegalAccessException if constructor is private of class.
										// throws InstantiationException if class is abstarct or interface.
		System.out.println();

		Class<AbstractNewInstance> class2 = (Class<AbstractNewInstance>) Class
				.forName("_05classDotForNameMethod.AbstractNewInstance");
		class2.newInstance();

	}

}
