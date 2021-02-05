package _02immutableclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class ImmutableStudent4 {

	private final int id;
	private final String name;
	List<Address> addresses; // Passing Mutable Collections as field to Immutable Class

	public ImmutableStudent4(int id, String name, List<Address> addresses) {
		this.name = name;
		this.id = id;
		this.addresses = addresses;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<Address> getAddresses() {
		return Collections.unmodifiableList(addresses);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ",name=" + name + ", addresses=" + addresses + "]";
	}

}

public class _07CusotmImmutableClassCreationCase4Demo {

	public static void main(String[] args) {

		Address address1 = new Address("221B", "Baker Street", "London");
		Address address2 = new Address("66", "Perry Street", "West Village");

		List<Address> addresses = new ArrayList<>();

		addresses.add(address1);
		addresses.add(address2);

		ImmutableStudent4 student = new ImmutableStudent4(1, "Taher", addresses);
		System.out.println(student);

		address1.setCity("Tokyo");
		System.out.println(student);
		
		student.getAddresses().add(new Address("221A", "Long Street", "Delhi"));
		System.out.println(student);

	}

}
