package _05inheritanceInSerialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal implements Serializable {
	int i = 10;

	public Animal() {
		super();
		System.out.println("Animal Constructor called");
	}

}

class Dog extends Animal {
	int j = 20;

	public Dog() {
		super();
		System.out.println("Dog Constructor called");
	}

}

/*
 * If Parent class implements serializable then by default every child is also
 * serialized
 */
public class _01ParentImplementsSerializableDemo {

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		Dog d1 = new Dog();
		d1.i = 30;
		d1.j = 40;
		System.out.println("Before Serialization i is " + d1.i + " and j is "
				+ d1.j);

		FileOutputStream fos = new FileOutputStream("case1.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);

		FileInputStream fis = new FileInputStream("case1.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();
		System.out.println("After DeSerialization i is " + d1.i + " and j is "
				+ d1.j);
	}

}
