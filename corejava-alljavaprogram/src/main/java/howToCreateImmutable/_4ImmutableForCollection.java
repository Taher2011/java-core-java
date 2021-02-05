package howToCreateImmutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Phone {

	private String brand;

	public Phone(String brand) {
		super();
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return brand;
	}

}

class Address {

	private String city;

	public Address(String city) {
		super();
		this.city = city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "[city=" + city + "]";
	}

}

class Person {

	private final String name;
	private final Address address;
	private final List<Phone> phones;

	public Person(String name, Address address, List<Phone> phones) {
		super();
		this.name = name;
		Address clonedAddress = new Address(address.getCity());
		this.address = clonedAddress;
		List<Phone> clonedPhones = new ArrayList<>();
		for (Phone phone : phones) {
			Phone phone1 = new Phone(phone.getBrand());
			clonedPhones.add(phone1);
		}
		this.phones = phones;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		Address clonedAddress = new Address(address.getCity());
		return clonedAddress;
	}

	public List<Phone> getPhones() {
		return Collections.unmodifiableList(phones);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", phones=" + phones + "]";
	}

}

public class _4ImmutableForCollection {

	public static void main(String[] args) {
		Phone phone1 = new Phone("Nokia");
		Phone phone2 = new Phone("Samsung");
	
		List<Phone> phones = new ArrayList<>();
		phones.add(phone1);
		phones.add(phone2);
		
		Address address1 = new Address("Indore");
		
		Person person1 = new Person("Taher", address1, phones);
		System.out.println(person1);
		
		address1.setCity("Hyderabad");
		System.out.println(person1);
		
		person1.getAddress().setCity("Delhi");
		System.out.println(person1);

		phone1.setBrand("Apple");
		System.out.println(person1);
		
		person1.getPhones().add(new Phone("Vivo"));
		System.out.println(person1);
	}

}
