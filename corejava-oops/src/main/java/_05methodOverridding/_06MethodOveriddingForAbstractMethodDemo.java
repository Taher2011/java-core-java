package _05methodOverridding;

class Parent5 {

	public void property() {
		System.out.println("GoldCashLand");
	}

	public Parent5 marriage() {
		System.out.println("Parent5 marriage");
		return new Parent5();
	}

}

abstract class Child5 extends Parent5 {

	@Override
	public abstract Child5 marriage();

}

public class _06MethodOveriddingForAbstractMethodDemo {

	public static void main(String[] args) {

		Parent5 p = new Parent5();
		// Child5 c = new Child5();
		// Parent5 pc = new Child5();

		p.property();
		p.marriage();
	}

}
