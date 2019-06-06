package _06polymorphism;

/*
 * Polymorphism is the concept, calling the same method with different object performs the different behavior.
 * Polymorphism is the ability for an object to vary behavior based on its type.
 * */

import java.util.ArrayList;
import java.util.List;

abstract class Soldier {
	public abstract void attack();
}

class Archer extends Soldier {

	@Override
	public void attack() {
		System.out.println("Archer attack");
	}

}

class Paladin extends Soldier {

	@Override
	public void attack() {
		System.out.println("Paladin attack");
	}

}

class Gunmen extends Soldier {

	@Override
	public void attack() {
		System.out.println("Gunmen attack");
	}

}

class Robot extends Soldier {

	@Override
	public void attack() {
		System.out.println("Robot attack");
	}

}

public class _01PolymorphismDemo {

	public static void main(String[] args) {
		List<Soldier> listSoldier = new ArrayList<>();
		listSoldier.add(new Archer());
		listSoldier.add(new Paladin());
		listSoldier.add(new Gunmen());
		listSoldier.add(new Robot());

		for (Soldier soldier : listSoldier) {
			soldier.attack();
		}
	}

}
