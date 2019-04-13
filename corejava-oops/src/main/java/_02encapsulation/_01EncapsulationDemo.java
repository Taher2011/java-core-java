package _02encapsulation;


/**
 * Process of binding data and corresponding method into single unit is called
 * encapsulation. In java every class is example of encapsulation.
 */
class Account {

	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if (balance >= 50) {
			this.balance = balance;
		} else {
			this.balance = balance + 50;
		}
	}

}

public class _01EncapsulationDemo {

	public static void main(String[] args) {
		Account account = new Account();
		account.setBalance(50);
		System.out.println(account.getBalance());
	}

}
