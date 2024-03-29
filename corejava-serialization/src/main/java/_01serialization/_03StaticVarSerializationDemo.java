package _01serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Cow implements Serializable {
	int a = 10;
	static int b = 20; // Static variable is not part of object and hence it
						// won't participate in serialization.
}

public class _03StaticVarSerializationDemo {

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {

		Cow c1 = new Cow();
		System.out.println("Before Serialization " + c1.a + " " + c1.b);

		FileOutputStream fos = new FileOutputStream("dog.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(c1);

		FileInputStream fis = new FileInputStream("dog.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Cow c2 = (Cow) ois.readObject();

		System.out.println("After  DeSerialization " + c2.a + " " + c2.b);
	}

}
