package _05throw;

class IncorrectPinException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String message;

	public IncorrectPinException(String message) {
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

public class _05ThrowingCustomizedExcpDemo {

	public static void withdrawAmount(int providedPin) {
		int pin = 1352;
		if (pin != providedPin) {
			throw new IncorrectPinException("Incorrect Pin");
		} else {
			System.out.println("Pin accepted");
		}
	}

	public static void main(String[] args) {
		System.out.println("In main method");
		withdrawAmount(1867);
	}

}
