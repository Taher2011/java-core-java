package _05methodOverridding;

class Parent1 {
	
	public void property() {
		System.out.println("GoldCashLand");
	}

	public Parent1 marriage() {
		System.out.println("Parent1 marriage");
		return new Parent1();
	}
}

class Child1 extends Parent1 {
	
	public Child1 marriage() { //overriding method with co-variant return type
		System.out.println("Child1 marriage");
		return new Child1();
	}
}

public class _02MethodOveriddingDemo {

	public static void main(String[] args) {
		
		Parent1 p = new Parent1();
		Child1 c = new Child1();
		Parent1 pc = new Child1();

		p.property();
		p.marriage();

		System.out.println();
		
		c.property();
		c.marriage();

		System.out.println();
		
		pc.property();
		pc.marriage();
	}

}
