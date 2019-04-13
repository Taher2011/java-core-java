package _07classInsideInterface;

interface Vehicle {

	public int getNoofWheels();

	class DefaultVehicle implements Vehicle {

		@Override
		public int getNoofWheels() {
			return 2;
		}

	}
}

class Bus implements Vehicle {

	@Override
	public int getNoofWheels() {
		return 8;
	}

}

public class Test {

	public static void main(String[] args) {
		Vehicle.DefaultVehicle defaultVehicle = new Vehicle.DefaultVehicle();
		System.out.println(defaultVehicle.getNoofWheels());
		
		Bus bus = new Bus();
		System.out.println(bus.getNoofWheels());
	}

}
