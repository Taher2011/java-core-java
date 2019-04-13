package _02orderInSerialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * If we don't know order of serialization
 */
public class _02OrderInSerializationNotKnownDemo {

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {

		FileInputStream fis = new FileInputStream("animal.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object object = ois.readObject();

		if (object instanceof Cat) {
			Cat c2 = (Cat) object;
		} else if (object instanceof Rat) {
			Rat r2 = (Rat) ois.readObject();
		} else if (object instanceof Dog) {
			Dog d2 = (Dog) ois.readObject();
		}

	}

}
