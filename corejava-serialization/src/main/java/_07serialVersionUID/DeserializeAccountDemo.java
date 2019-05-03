package _07serialVersionUID;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeAccountDemo {

	public static void deserializeAccountWithUid() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("withuid.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		AccountWithSerialVersionUID account = (AccountWithSerialVersionUID) ois.readObject();
		System.out.println("Account Number: " + account.getAccountNumber());
		System.out.println("Account Name  : " + account.getAccountName());
		System.out.println("Account Type  : " + account.getAccountType());
	}
	
	public static void deserializeAccountWithoutUid() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("withoutuid.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		AccountWithoutSerialVersionUID account = (AccountWithoutSerialVersionUID) ois.readObject();
		System.out.println("Account Number: " + account.getAccountNumber());
		System.out.println("Account Name  : " + account.getAccountName());
		System.out.println("Account Type  : " + account.getAccountType());
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		deserializeAccountWithoutUid();
		System.out.println();
		deserializeAccountWithUid();
	}

}
