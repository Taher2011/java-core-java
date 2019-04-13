package _07synchronized;

import com.sun.org.apache.bcel.internal.generic.ACONST_NULL;

class BankAccount {

	private double balance;

	BankAccount(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	/*
	 * 598.0 deposited and balance amount is 1098.25 1000.0 withdrawn and
	 * balance amount is 98.25
	 */
	public synchronized void deposit(double amount) {
		balance = balance + amount;
		System.out.println(amount + " deposited and balance amount is "
				+ balance);
	}

	public synchronized void withdraw(double amount) {
		if (amount > balance) {
			System.out.println("Amount entered is more than available balance");
			return;
		}
		balance = balance - amount;
		System.out.println(amount + " withdrawn and balance amount is "
				+ balance);
	}

	public void checkBalance() {
		System.out.println("available balance amount is " + balance);
	}

}

class BankAccountDepositThread extends Thread {

	private BankAccount bankAccount;

	BankAccountDepositThread(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	public void run() {
		bankAccount.deposit(598.0);
	}

}

class BankAccountWithdrawThread extends Thread {

	private BankAccount bankAccount;

	BankAccountWithdrawThread(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	public void run() {
		bankAccount.withdraw(444);
	}

}

class BankAccountGetbalanceThread extends Thread {

	private BankAccount bankAccount;

	BankAccountGetbalanceThread(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	public void run() {
		bankAccount.checkBalance();
	}

}

public class _08BankAccount {

	public static void main(String[] args) throws InterruptedException {
		BankAccount bankAccount = new BankAccount(500.25);

		BankAccountDepositThread accountThread1 = new BankAccountDepositThread(
				bankAccount);
		BankAccountWithdrawThread accountThread2 = new BankAccountWithdrawThread(
				bankAccount);
		BankAccountWithdrawThread accountThread3 = new BankAccountWithdrawThread(
				bankAccount);
		BankAccountGetbalanceThread accountThread4 = new BankAccountGetbalanceThread(
				bankAccount);

		accountThread1.start();
		accountThread2.start();
		accountThread3.start();
		accountThread3.join();
		accountThread4.start();
	}

}
