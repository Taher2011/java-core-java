package _02immutableclass;

import java.util.ArrayList;

class Address {
	String firstLine;
	String secondLine;
	String city;

	public Address(String firstLine, String secondLine, String city) {
		super();
		this.firstLine = firstLine;
		this.secondLine = secondLine;
		this.city = city;
	}

	public String getFirstLine() {
		return firstLine;
	}

	public void setFirstLine(String firstLine) {
		this.firstLine = firstLine;
	}

	public String getSecondLine() {
		return secondLine;
	}

	public void setSecondLine(String secondLine) {
		this.secondLine = secondLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}

final class ImmutableStudent4 {

	private final int id;
	private final String name;
	ArrayList<Address> addressList; // Passing Mutable Collections as field to Immutable Class

	public ImmutableStudent4(int id, String name, ArrayList<Address> addressList) {
		this.name = name;
		this.id = id;
		this.addressList = addressList;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Address> getAddressList() {
		return new ArrayList<>(addressList);
	}
}

public class _07CusotmImmutableClassCreationCase4Demo {

	public static void main(String[] args) {
		ArrayList<Address> addressList = new ArrayList<>();
		addressList.add(new Address("221B", "Baker Street", "London"));
		addressList.add(new Address("66", "Perry Street", "West Village"));

		ImmutableStudent4 student = new ImmutableStudent4(1, "Taher", addressList);

		// fetch address list from the User object and store it in local variable
		// localAddressList
		ArrayList<Address> localAddressList = student.getAddressList();
		System.out.println(localAddressList);

		// remove address at 0th position in ArrayList
		localAddressList.remove(0);

		// display address list from User object
		System.out.println(student.getAddressList());
	}

}
