package _05methodOverridding;

class Parent8 {

	public static void property() throws Exception {
		System.out.println("Parent8 GoldCashLand");
	}

	public void marriage() throws Exception {
		System.out.println("Parent8 marriage");
	}

}

class Child8 extends Parent8 {

	// Method hiding
	public static void property() throws Exception {
		System.out.println("Child8 GoldCashLand");
	}

	public void marriage() {
		System.out.println("Child8 marriage");
	}
}

public class _09MethodOveriddingStaticMethodHidingDemo {

	public static void main(String[] args) {
		Parent8 pc = new Child8();

		try {
			pc.property();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			pc.marriage();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
