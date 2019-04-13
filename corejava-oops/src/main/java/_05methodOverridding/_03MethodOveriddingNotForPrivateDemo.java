package _05methodOverridding;

class Parent2 {

	public void property() {
		System.out.println("GoldCashLand");
	}

	private Parent2 marriage() { // overriding of private method not applicable
		System.out.println("Parent2 marriage");
		return new Parent2();
	}
}

class Child2 extends Parent2 {

	public Child2 marriage() {
		System.out.println("Child2 marriage");
		return new Child2();
	}
}

public class _03MethodOveriddingNotForPrivateDemo {

	public static void main(String[] args) {

		Parent2 p = new Parent2();
		Child2 c = new Child2();
		Parent2 pc = new Child2();

		p.property();
		// p.marriage(); //compile error

		System.out.println();
		
		c.property();
		c.marriage();

		System.out.println();
		
		pc.property();
		// pc.marriage(); //compile error because marriage is private method
	}

}
