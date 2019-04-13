package _04customizedSerialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* During default serialization there may be chance of loss of information
 * due to transient variable. To recover this loss of information,
 * we use Customized serialization*/
class Accounts implements Serializable {

	String userName = "tali";
	transient String password = "ABCD";
	transient int pin = 1234;

	private void writeObject(ObjectOutputStream oos) throws Exception { //It is callback method automatically called by jvm while serialization i.e. at line 47
		oos.defaultWriteObject();
		String encryptedPassword = "123" + password;
		oos.writeObject(encryptedPassword);
		int encryptedPin = 1234+1234;
		oos.writeInt(encryptedPin);
	}

	private void readObject(ObjectInputStream ois) throws Exception { //It is callback method automatically called by jvm while deserialization i.e. at line 51
		ois.defaultReadObject();
		String decryptedPassword = (String) ois.readObject();
		password = decryptedPassword.substring(3);
		int decryptedPin = ois.readInt()-1234;
		pin = decryptedPin;
	}

}

public class _02CustomizedSerializationDemo {

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		Accounts a1 = new Accounts();
		System.out.println("Before Serialization UserName " + a1.userName
				+ " and Password " + a1.password + " and Pin " + a1.pin);

		FileOutputStream fos = new FileOutputStream("accounts.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);

		System.out.println();
		
		FileInputStream fis = new FileInputStream("accounts.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Accounts a2 = (Accounts) ois.readObject();
		System.out.println("After DeSerialization UserName " + a2.userName
				+ " and Password " + a1.password + " and Pin " + a1.pin);

	}

}
