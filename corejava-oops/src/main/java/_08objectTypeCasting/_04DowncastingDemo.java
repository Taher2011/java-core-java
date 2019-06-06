package _08objectTypeCasting;

/*Downcasting is casting to a subtype, downward to the inheritance tree. Let’s see an example:
Here, we cast the Animal type to the Cat type. As Cat is subclass of Animal, this casting is called downcasting.
Unlike upcasting, downcasting can fail if the actual object type is not the target object type.
Downcasting is used more frequently than upcasting. Use downcasting when we want to access specific behaviors of a subtype.
*/

interface Mammal1 {

	public void eat();

	public void move();

	public void sleep();
}

abstract class Animal1 implements Mammal1 {

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

class Dog1 extends Animal1 {

	public void bark() {
		System.out.println("Gow gow!");
	}

	public void eat() {
		System.out.println("Dog is eating...");
	}
}

class Cat1 extends Animal1 {

	public void meow() {
		System.out.println("Meow Meow!");
	}
}

public class _04DowncastingDemo {

	public static void main(String[] args) {

		Animal1 animalDog = new Dog1();
		animalDog.eat();
		// animalDog.bark(); // compile error

		Dog1 dog1 = (Dog1) animalDog;
		dog1.bark();
		dog1.eat();
	}

}
