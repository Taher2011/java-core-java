package _05methodOverridding;

class Parent3 {

	public void property() {
		System.out.println("GoldCashLand");
	}

	public final Parent3 marriage() {
		System.out.println("Parent3 marriage");
		return new Parent3();
	}

	private final Parent3 job() {
		System.out.println("Parent3 marriage");
		return new Parent3();
	}
}

class Child3 extends Parent3 {

	// below method will get compile time error as we can't override final
	// method.
	/*
	 public Parent3 marriage() { 
		  System.out.println("Child3"); 
		  return new  Child3(); 
	  }
	 */

	// below method will not throw compile time error as job method is private
	// and not overriding.
	public Parent3 job() {
		System.out.println("Parent3");
		return new Parent3();
	}
}

public class _04MethodOveriddingNotForFinalDemo {

	public static void main(String[] args) {

		Parent3 p = new Parent3();
		Child3 c = new Child3();
		Parent3 pc = new Child3();

		p.property();
		p.marriage();
		// p.job(); //compile error because job is private method

		System.out.println();
		
		c.property();
		c.marriage();
		c.job();

		System.out.println();
		
		pc.property();
		pc.marriage();
		// pc.job(); //compile error because job is private method
	}

}
