package _07serialVersionUID;

import java.io.Serializable;

public class AccountWithoutSerialVersionUID implements Serializable {

	private String accountName = "Yasmin123";
	private String accountType = "Current";
	private int accountNumber = 654321;
	private String accountBranch = "Indore";

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
