package _01serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Lion implements Serializable {
	int a = 10;
	final int b = 20; // Final variable will be participated in serialization
						// directly by the value at compile time only
}

public class _04FinalVarSerializationDemo {

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {

		Lion l1 = new Lion();
		System.out.println("Before Serialization " + l1.a + " " + l1.b);

		FileOutputStream fos = new FileOutputStream("dog.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(l1);

		FileInputStream fis = new FileInputStream("dog.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Lion l2 = (Lion) ois.readObject();

		System.out.println("After  DeSerialization " + l2.a + " " + l2.b);
	}

}
