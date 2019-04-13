package _05inheritanceInSerialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Company {
	int i = 10;

	public Company() {// no-arg constructor is must for non-serializable parent class because its being called while deserailization
		super();
		System.out.println("Company Constructor called");
	}

}

class Employee extends Company implements Serializable {
	int j = 20;

	public Employee() {
		super();
		System.out.println("Employee Constructor called");
	}
}

/*
 * If Parent class doesn't implements serializable then we can serialize child
 * object. At the time of Serialization jvm will check is any var coming from
 * non-serialize parent class or not if yes then jvm ignores original value and
 * save default value. At the time of DeSerialization jvm will check is any
 * parent class is non-serialized or not if any parent class is non-serialized
 * then jvm will execute instance control flow in every non-serialized parent
 * and share its instance var to the current object. If non-serialized parent
 * class doesn't contain default constructor then we will get runtime exception
 * InvalidClassException.
 */
public class _02ChildImplementsSerializableDemo {

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		Employee e1 = new Employee();
		e1.i = 30;
		e1.j = 40;

		System.out.println("Before Serialization i is " + e1.i + " and j is "
				+ e1.j);

		FileOutputStream fos = new FileOutputStream("case2.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);
		
		System.out.println();
		
		FileInputStream fis = new FileInputStream("case2.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee e2 = (Employee) ois.readObject();
		System.out.println("After DeSerialization i is " + e2.i + " and j is "
				+ e2.j);
	}

}
