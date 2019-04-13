package _05methodOverridding;

class Animal {
	
	public void bark(int...a) {
		System.out.println("Animal Bark");
	}

	public void sark(int...a) {
		System.out.println("Animal Sark");
	}
}

class Monkey extends Animal {
	
	public void bark(int a) {
		System.out.println("Monkey Bark");
	}
	
	public void sark(int...a) {
		System.out.println("Monkey Sark");
	}

}
public class _12MethodOverriddingVarArgsDemo {

	public static void main(String[] args) {
		Animal animal = new Monkey();
		animal.bark();
		animal.sark(4);
	}

}
