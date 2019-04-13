package _03objectGraphInSerialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable {
	Cat cat = new Cat();
}

class Cat implements Serializable {
	Rat rat = new Rat();
}

class Rat implements Serializable {
	int j = 20;
}

/*
 * Whenever we are serializing Dog object automatically Cat and Rat object got
 * serialized because these are part of object graph of Dog. If among Dog object
 * at least one object is not serializable then we will get run time exception
 * NotSerializableException
 */
public class _01ObjectGraphDemo {

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		Dog dog1 = new Dog();
		FileOutputStream fos = new FileOutputStream("animal.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(dog1);

		FileInputStream fis = new FileInputStream("animal.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog dog2 = (Dog) ois.readObject();

		System.out.println(dog2.cat.rat.j);

	}

}
