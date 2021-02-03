package _05classDotForNameMethod;

abstract class AbstractLoad {

	static {
		System.out.println("static block of AbstractLoad class loaded");
	}

}

class Load {

	static {
		System.out.println("static block of Load class loaded");
	}

}

/*
 * class.forName("className") is used to load the class which is being passed as
 * a argument to the method and it creates and returns class Class object which
 * is then used to get runtime information of class.
 */

public class _01ClassDotForNameMethodDemo {

	public static void main(String[] args) throws Exception {

		@SuppressWarnings("unchecked")
		Class<Load> class1 = (Class<Load>) Class.forName("_05classDotForNameMethod.Load");

		@SuppressWarnings("unchecked")
		Class<AbstractLoad> class2 = (Class<AbstractLoad>) Class.forName("_05classDotForNameMethod.AbstractLoad");

	}

}
