package _17hashMapClass;

class Address { 

	private int addressId;
	private String city;

	public Address(int addressId, String city) {
		super();
		this.addressId = addressId;
		this.city = city;
	}

	public int getAddressId() {
		return addressId;
	}

	public String getCity() {
		return city;
	}

	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (object instanceof Address) {
			Address address = (Address) object;
			if (this.addressId == address.getAddressId()
					&& this.city.equals(address.getCity())) {
				return true;
			}
		}
		return false;
	}

	public int hashCode() {
		return city.hashCode() + addressId;
	}
}

public class _01EqualAndHashCodeContractDemo {

	public static void main(String[] args) {
		Address address1 = new Address(123, "Indore");
		Address address2 = new Address(123, "Bhopal");
		Address address3 = new Address(123, "Indore");
		Address address4 = address1;

		if (address1.equals(address3)) {
			System.out
					.println("If two objects are     equals by equals(), then their hasCode() is always same");
		}
		if (!(address1.equals(address2))) {
			System.out
					.println("If two objects are not equals by equals(), then their hasCode() may or may not be same");
		}
		System.out
				.println("If two objects are having same      hashcode, then two objects may or may not be equals by equals()");
		System.out
				.println("If two objects are having different hashcode, then two objects is always different by equals()");

	}

}
