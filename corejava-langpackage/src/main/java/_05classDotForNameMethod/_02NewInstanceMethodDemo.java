package _05classDotForNameMethod;

abstract class AbstarctNewInstance {

	static {
		System.out.println("AbstarctLoad Loaded");
	}

}

class LoadNewInstance {

	static {
		System.out.println("Class Loaded");
	}

	{
		System.out.println("Instance mehtod");
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
		Class<LoadNewInstance> class1 = (Class<LoadNewInstance>) Class.forName("_05clasForNameMethod.LoadNewInstance");

		class1.newInstance().load(); // throws IllegalAccessException if constructor is private of class.
							  		 // throws InstantiationException if class is abstarct or interface.
		System.out.println();

		Class<AbstarctNewInstance> class2 = (Class<AbstarctNewInstance>) Class.forName("_05clasForNameMethod.AbstarctNewInstance");
		class2.newInstance();

	}

}
