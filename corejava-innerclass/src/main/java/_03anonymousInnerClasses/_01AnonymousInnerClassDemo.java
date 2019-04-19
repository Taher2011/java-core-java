package _03anonymousInnerClasses;

class Popcorn {

	public void taste() {
		System.out.println("Sweet");
	}

	public void color() {
		System.out.println("Light Yellow");
	}

	public void price() {
		System.out.println("50Rs");
	}
}

class Nacho {

	public void taste() {
		System.out.println("Sweet");
	}

	public void color() {
		System.out.println("Light Yellow");
	}

	public void price() {
		System.out.println("50Rs");
	}
}

public class _01AnonymousInnerClassDemo {

	public static void getNachosColor() {
		Nacho nacho = new Nacho() {
			public void color() {
				System.out.println("Light Yellow");
			}
		};
		nacho.color();
	}

	public static void main(String[] args) {

		Popcorn popcorn1 = new Popcorn() {
			public void taste() {
				System.out.println("Salty");
			}
		};
		popcorn1.taste();
		System.out.println(popcorn1.getClass().getName());

		System.out.println();

		Popcorn popcorn2 = new Popcorn();
		popcorn2.taste();
		System.out.println(popcorn2.getClass().getName());

		System.out.println();
		getNachosColor();
	}

}
