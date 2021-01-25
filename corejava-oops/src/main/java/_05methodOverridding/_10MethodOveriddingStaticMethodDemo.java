package _05methodOverridding;

class Parent9 {

	public static void property() throws Exception {
		System.out.println("Parent9 GoldCashLand");
	}

	public void marriage() throws Exception {
		System.out.println("Parent9 marriage");
	}

}

class Child9 extends Parent9 {

//	 compile error because we cannot override static method as non-static

//	  public void property() throws Exception {
//	   System.out.println("Child9 GoldCashLand"); 
//	  }

//	 compile error because we cannot override non-static method as static

//	  public static void marriage() { 
//	   System.out.println("Child9 marriage"); 
//	  }
//	 
}

public class _10MethodOveriddingStaticMethodDemo {

	public static void main(String[] args) {
		Parent9 pc = new Child9();

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
