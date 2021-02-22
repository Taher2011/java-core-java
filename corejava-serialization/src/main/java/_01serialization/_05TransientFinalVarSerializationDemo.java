package _01serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Case 1: Initializing final transient variable at the time of declaration (explicit initialization)
//This case is very simple, as during serialization process directly value is serialized instead of final variable
//Important : There is no impact on final variable declaring as transient
//In the below example customerAge is declared as final as well as transient and explicitly initialized with value 10

//Case 2: Initializing final transient variable inside constructor or instance block
//These cases are bit tricky; when we serialize an Object
//all non-final instance variables will be serialized
//all non-final transient variable won’t be serialized
//all final non-transient variable will be serialized (directly as values)
//Important : But all final transient variable won’t be serialized

class Customer implements Serializable {

	final int customerId;
	transient final String customerName;
	transient final int customerAge = 10;
	transient int customerSSN;

	public Customer(int customerId, String customerName, int customerSSN) {
		this.customerId = customerId;
		this.customerName = customerName; // final transient
		this.customerSSN = customerSSN;
	}

	@Override
	public String toString() {
		return "Customer [" + "customerId=" + customerId + ", customerName=" + customerName + ", customerAge="
				+ customerAge + ", customerSSN=" + customerSSN + "]";
	}
}

public class _05TransientFinalVarSerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// create an customer instance using 3-arg constructor
		Customer serializeCustomer = new Customer(107, "Sam", 117896);

		// creating output stream variables for writing or saving binary data
		FileOutputStream fos = new FileOutputStream("Customer.ser");
		// converting java-object to binary-format
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		// writing or saving customer object's value to stream
		oos.writeObject(serializeCustomer);
		oos.flush();
		oos.close();

		// creating input stream variables for reading binary data
		FileInputStream fis = new FileInputStream("Customer.ser");
		// converting binary-data to java-object
		ObjectInputStream ois = new ObjectInputStream(fis);
		// reading object's value and casting to Customer class
		Customer deSerializeCustomer = (Customer) ois.readObject();
		ois.close();

		// printing customer object to console using toString() method
		System.out.println("Customer values  " + deSerializeCustomer);
	}

}
