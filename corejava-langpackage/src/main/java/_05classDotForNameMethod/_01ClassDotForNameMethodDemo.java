package _05classDotForNameMethod;

abstract class AbstarctLoad {

	static {
		System.out.println("AbstarctLoad Loaded");
	}

}

class Load {

	static {
		System.out.println("Class Loaded");
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
		Class<Load> class1 = (Class<Load>) Class.forName("_05clasForNameMethod.Load");

		@SuppressWarnings("unchecked")
		Class<AbstarctLoad> class2 = (Class<AbstarctLoad>) Class.forName("_05clasForNameMethod.AbstarctLoad");

	}

}
