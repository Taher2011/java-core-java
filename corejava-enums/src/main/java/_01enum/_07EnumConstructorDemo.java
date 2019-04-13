package _01enum;

enum Bike {

	HERO, BAJAJ, HONDA;    // public static final Bike HERO = new Bike(),
		                   // public static final Bike BAJAJ = new Bike(),
	                       // public static final Bike HONDA = new Bike();

	Bike() {
		System.out.println("Enum Constructor");
	}

}

public class _07EnumConstructorDemo {

	public static final _07EnumConstructorDemo t1 = new _07EnumConstructorDemo();
	public static final _07EnumConstructorDemo t2 = new _07EnumConstructorDemo();

	public _07EnumConstructorDemo() {
		super();
		System.out.println("Class Constructor");
	}

	public static void main(String[] args) {
		Bike b = Bike.BAJAJ;
	}

}
