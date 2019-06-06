package _08objectTypeCasting;

/*Upcasting is casting a subtype to a supertype, upward to the inheritance tree. Let’s see an example:
Here, we cast the Dog type to the Animal type. Because Animal is the supertype of Dog, this casting is called upcasting.
Note that the actual object type does not change because of casting. The Dog object is still a Dog object. Only the reference type gets changed. 
Hence the above code produces the following output:
Upcasting is always safe, as we treat a type to a more general one. In the above example, an Animal has all behaviors of a Dog.
Generally, upcasting is not necessary. However, we need upcasting when we want to write general code that deals with only the supertype. 
*/

interface Mammal {

	public void eat();

	public void move();

	public void sleep();
}

abstract class Animal implements Mammal {

	public void eat() {
		System.out.println("Eating...");
	}

	public void move() {
		System.out.println("Moving...");
	}

	public void sleep() {
		System.out.println("Sleeping...");
	}

}

class Dog extends Animal {

	public void bark() {
		System.out.println("Gow gow!");
	}

	public void eat() {
		System.out.println("Dog is eating...");
	}
}

class Cat extends Animal {

	public void meow() {
		System.out.println("Meow Meow!");
	}
}

public class _03UpcastingDemo {

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.bark();

		Animal animalDog = (Dog) dog;
		// animalDog.bark(); // compile time error
	}

}
