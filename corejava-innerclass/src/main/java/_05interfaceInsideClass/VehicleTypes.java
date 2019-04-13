package _05interfaceInsideClass;

public class VehicleTypes {

	interface Vehicle {
		public int getNoofWheels();
	}

	class Bus implements Vehicle {

		@Override
		public int getNoofWheels() {
			return 6;
		}

	}

	class Auto implements Vehicle {

		@Override
		public int getNoofWheels() {
			return 3;
		}

	}

	public static void main(String[] args) {

	}

}
