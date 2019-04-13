package _05methodOverridding;

class Parent {
	
	public void property() {
		System.out.println("GoldCashLand");
	}

	public void marriage() {
		System.out.println("Parent marriage");
	}
}

class Child extends Parent {
	
	public void marriage() {
		System.out.println("Child marriage");
	}
}

public class _01MethodOveriddingDemo {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		Child c = new Child();
		Parent pc = new Child();

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
