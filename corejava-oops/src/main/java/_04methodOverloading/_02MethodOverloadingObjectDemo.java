package _04methodOverloading;

/* In method overloading method signatures will be checked,
 * method name and method arguments are part of method signature
 */

class Animal {
}

class Cat extends Animal {
}

public class _02MethodOverloadingObjectDemo {

	public void m1(Animal animal) {
		System.out.println("Animal");
	}

	public void m1(Cat cat) {
		System.out.println("Cat");
	}

	public static void main(String[] args) {
		_02MethodOverloadingObjectDemo demo = new _02MethodOverloadingObjectDemo();

		Animal animal = new Animal();
		Cat cat = new Cat();
		Animal animalCat = new Cat();

		demo.m1(animal); // Animal
		demo.m1(cat); // Cat
		demo.m1(animalCat); // Animal because method resolution always takes care by compiler
							// based on reference type and run time object wont
							// play any role
	}

}
