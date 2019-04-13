package _04staticNestedClasses;

public class _03StaticNestedClassCanContainStaticDemo {

	static class Inner3 {

		public static void main(String[] args) {
			System.out.println("Static nested class main method");
		}
	}

	public static void main(String[] args) {
		System.out.println("Outer class main method");
	}

}
