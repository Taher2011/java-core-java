package _04staticNestedClasses;

public class _01StaticNestedClassDemo {

	static class Nested {
		public void m1() {
			System.out.println("Nested Static class method");
		}
	}

	public static void main(String[] args) {
		Nested n = new Nested();
		n.m1();
	}

}
