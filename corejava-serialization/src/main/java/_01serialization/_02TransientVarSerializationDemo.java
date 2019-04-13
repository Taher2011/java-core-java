package _01serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Cat implements Serializable {
	int a = 10;
	transient int b = 20; // while performing serialization jvm ignores the
							// original value of transient variable and save
							// default value to file.
}

public class _02TransientVarSerializationDemo {

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {

		Cat d1 = new Cat();
		System.out.println("Before Serialization " + d1.a + " " + d1.b);

		FileOutputStream fos = new FileOutputStream("dog.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);

		FileInputStream fis = new FileInputStream("dog.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Cat d2 = (Cat) ois.readObject();

		System.out.println("After  DeSerialization " + d2.a + " " + d2.b);
	}

}
