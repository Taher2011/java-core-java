package _01enum;

interface X {
	int a = 5;

	void test();
}

enum Country implements X {
	INDIA, PAK;             // public static final Country INDIA = new Country(),
							// public static final Country PAK = new Country(),


	int a = 6;

	public void test() {
		System.out.println("test method");

	}
}

public class _04EnumDemo {

	public static void main(String[] args) {

		Country country = Country.INDIA;
		country.test();
		System.out.println(country.a);

		X x = Country.PAK;
		System.out.println(x.a);

	}

}
