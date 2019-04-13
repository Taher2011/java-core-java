package _05methodOverridding;

class Parent6 {

	void property() {
		System.out.println("GoldCashLand");
	}

	protected Parent6 marriage() {
		System.out.println("Parent6 marriage");
		return new Parent6();
	}

	public Parent6 job() {
		System.out.println("Parent6 job");
		return new Parent6();
	}

}

class Child6 extends Parent6 {

	protected void property() {
		System.out.println("GoldCashLand");
	}

	public Parent6 marriage() {
		System.out.println("Child6 marriage");
		return new Parent6();
	}

	public Parent6 job() {
		System.out.println("Child6 job");
		return new Parent6();
	}
}

public class _07MethodOveriddingAccessModifierScopeDemo {

	public static void main(String[] args) {

		Parent6 p = new Parent6();
		Child6 c = new Child6();
		Parent6 pc = new Child6();

		p.property();
		p.marriage();
		p.job();

		System.out.println();
		
		c.property();
		c.marriage();
		c.job();

		System.out.println();
		
		pc.property();
		pc.marriage();
		pc.job();

	}

}
