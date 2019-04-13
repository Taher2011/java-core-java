package _05throw;

class InsufficientAmountException extends Exception {

	private static final long serialVersionUID = 1L;
	private String message;

	public InsufficientAmountException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}

public class _02ThrowingCustomizedExcpDemo {

	public static void withdrawAmount(double amount, double balance) throws InsufficientAmountException {
		if (amount > balance) {
			throw new InsufficientAmountException("Insufficient Balance");
		} else {
			System.out.println(amount + " withdrawn");
		}
	}

	public static void main(String[] args) {
		System.out.println("In main method");
		try {
			withdrawAmount(1000, 500);
		} catch (InsufficientAmountException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
