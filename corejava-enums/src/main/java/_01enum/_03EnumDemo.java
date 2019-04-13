package _01enum;

enum Car {
	BMW, MARUTI, BENZ;    // public static final Car BMW = new Car(),
						  // public static final Car MARUTI = new Car(),
						  // public static final Car BENZ = new Car();
}

public class _03EnumDemo {

	public static void main(String[] args) {
		Car car = Car.BENZ;

		switch (car) {
		case BMW:
			System.out.println("BMW");
			break;
		case MARUTI:
			System.out.println("MARUTI");
			break;
		case BENZ:
			System.out.println("BENZ");
			break;
		default:
			System.out.println("DEFAULT");
			break;
		}
	}

}
