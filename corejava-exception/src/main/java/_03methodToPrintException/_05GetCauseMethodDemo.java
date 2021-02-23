package _03methodToPrintException;

class InvalidCurrencyDataException1 extends RuntimeException {

	public InvalidCurrencyDataException1(String message) {
		super(message);
	}

	public InvalidCurrencyDataException1(String message, Throwable cause) {
		super(message, cause);
	}

}

class CurrencyService1 {
	public String convertDollarsToEuros(String value) {
		try {
			int x = Integer.parseInt(value);
		} catch (NumberFormatException e) {
			throw new InvalidCurrencyDataException1("Invalid data", e);
		}
		return value;
	}
}

public class _05GetCauseMethodDemo {

	public static void main(String[] args) {
		CurrencyService1 service = new CurrencyService1();
		try {
			service.convertDollarsToEuros("asd");
		} catch (Exception e) {
			System.out.println(e.getCause());
		}
		System.out.println("=============================");
		System.out.println("=============================");
		service.convertDollarsToEuros("asd");

	}

}
