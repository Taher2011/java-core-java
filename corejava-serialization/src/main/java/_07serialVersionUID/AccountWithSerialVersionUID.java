package _07serialVersionUID;

import java.io.Serializable;

public class AccountWithSerialVersionUID implements Serializable {

	private static final long serialVersionUID = 1L;
	private String accountName = "Taher123";
	private String accountType = "Saving";
	private int accountNumber = 123456;

	public String getAccountName() {
		return accountName;
	}

	public String getAccountType() {
		return accountType;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

}
