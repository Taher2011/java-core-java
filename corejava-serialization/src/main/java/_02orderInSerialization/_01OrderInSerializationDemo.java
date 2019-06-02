package _02orderInSerialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable {

}

class Cat implements Serializable {

}

class Rat implements Serializable {

}

/*
 * Order of deserialization is important i.e the order in which we serialized
 * the object, if we don't follow the order while deserializing we will get run
 * time exception saying ClassCastException
 */
public class _01OrderInSerializationDemo {

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		Dog d1 = new Dog();
		Cat c1 = new Cat();
		Rat r1 = new Rat();

		FileOutputStream fos = new FileOutputStream("animal.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		oos.writeObject(c1);
		oos.writeObject(r1);

		FileInputStream fis = new FileInputStream("animal.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();
		Rat r2 = (Rat) ois.readObject(); // ClassCastException
		Cat c2 = (Cat) ois.readObject();
	}

}
