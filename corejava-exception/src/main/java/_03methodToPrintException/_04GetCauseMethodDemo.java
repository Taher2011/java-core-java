package _03methodToPrintException;

class InvalidCurrencyDataException extends RuntimeException {

	public InvalidCurrencyDataException(String message) {
		super(message);
	}

	public InvalidCurrencyDataException(String message, Throwable cause) {
		super(message, cause);
	}

}

class CurrencyService {
	public String convertDollarsToEuros(String value) {
		try {
			int x = Integer.parseInt(value);
		} catch (NumberFormatException e) {
			throw new InvalidCurrencyDataException("Invalid data");
		}
		return value;
	}
}

public class _04GetCauseMethodDemo {

	public static void main(String[] args) {
		CurrencyService service = new CurrencyService();
		service.convertDollarsToEuros("asd");

	}

}
