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
class Account implements Serializable {

	String userName = "tali";
	String otp = "010";
	transient String password = "ABCD";

	private void writeObject(ObjectOutputStream oos) throws IOException  { //It is callback method automatically called by jvm while serialization i.e. at line 42
		oos.defaultWriteObject();
		String encryptedPassword = "123" + password;
		oos.writeObject(encryptedPassword);
	}

	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException  { //It is callback method automatically called by jvm while deserialization i.e. at line 46
		ois.defaultReadObject();
		String decryptedPassword = (String) ois.readObject();
		password = decryptedPassword.substring(3);
	}

}

public class _01CustomizedSerializationDemo {

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		Account a1 = new Account();
		System.out.println("Before Serialization UserName " + a1.userName
				+ " and Password " + a1.password + " and OTP " + a1.otp);

		FileOutputStream fos = new FileOutputStream("account.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);

		FileInputStream fis = new FileInputStream("account.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account a2 = (Account) ois.readObject();
		System.out.println("After DeSerialization UserName " + a2.userName
				+ " and Password " + a2.password + " and OTP " + a2.otp);

	}

}
