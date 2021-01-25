package _06exceptions;

/*If A existed while compiling _02NoClassDefFoundErrorDemo.java , but not found while execution
 * i.e. A.class not not found then it throws NoClassDefFoundError.*/

class A {

}

public class _02NoClassDefFoundErrorDemo {

	public static void main(String[] args) {
		A a = new A();
	}

}
