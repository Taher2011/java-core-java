package _07serialVersionUID;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeAccountDemo {

	public static void serializeAccountWithUid() throws IOException {
		AccountWithSerialVersionUID accountWithUid = new AccountWithSerialVersionUID();
		FileOutputStream fos = new FileOutputStream("withuid.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(accountWithUid);
	}
	
	public static void serializeAccountWithoutUid() throws IOException {
		AccountWithoutSerialVersionUID accountWithoutUid = new AccountWithoutSerialVersionUID();
		FileOutputStream fos = new FileOutputStream("withoutuid.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(accountWithoutUid);
		System.out.println("Serialized");
	}

	public static void main(String[] args) throws IOException {
		serializeAccountWithoutUid();
		serializeAccountWithUid();
	}

}
