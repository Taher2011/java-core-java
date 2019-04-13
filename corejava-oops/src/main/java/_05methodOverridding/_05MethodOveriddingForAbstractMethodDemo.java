package _05methodOverridding;

abstract class Parent4 {

	public void property() {
		System.out.println("GoldCashLand");
	}

	public abstract Parent4 marriage();

	public void job() {
		System.out.println("Parent4 marriage");
	}

}

class Child4 extends Parent4 {

	@Override
	public Child4 marriage() {
		System.out.println("Child4 marriage");
		return new Child4();
	}

}

public class _05MethodOveriddingForAbstractMethodDemo {

	public static void main(String[] args) {

		// Parent4 p = new Parent4(); compile error as can't create object of
		// Abstract class
		Child4 c = new Child4();
		Parent4 pc = new Child4();

		c.property();
		c.marriage();

		System.out.println();
		
		pc.property();
		pc.marriage();
	}

}
