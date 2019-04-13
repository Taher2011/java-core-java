package _01javaLangObjectClass;

class Account {

	private int accountNo;
	private String accountType;

	public Account(int accountNo, String accountType) {
		super();
		this.accountNo = accountNo;
		this.accountType = accountType;
	}
	
	public void finalize() throws Throwable {
		System.out.println("Finalize method called by GC just before destroying an object to perform clean up activities");
	}

}

public class _05FinalizeMethodDemo {

	public static void main(String[] args) {
		Account account = new Account(123456, "Saving");
		account = null;
		System.gc();
	}

}
