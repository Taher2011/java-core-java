package _01serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable {
	int a = 10;
	int b = 20;
}

public class _01InstanceVarSerializationDemo {

	public static void main(String[] args) throws IOException,
	ClassNotFoundException {

		Dog d1 = new Dog();
		System.out.println("Before Serialization " + d1.a + " " + d1.b);

		FileOutputStream fos = new FileOutputStream("dog.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);

		FileInputStream fis = new FileInputStream("dog.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();

		System.out.println("After  DeSerialization " + d2.a + " " + d2.b);
	}

}
