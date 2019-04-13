package _01enum;

enum Company {
	CSC, TCS, ACCENTURE;    // public static final Company CSC = new Company(),
							// public static final Company TCS = new Company(),
							// public static final Company ACCENTURE = new Company();
}

public class _02EnumDemo {

	static enum City {
		INDORE, PUNE;    // public static final City INDORE = new City(),
	    				 // public static final City PUNE = new City();
	}

	public static void main(String[] args) {

		Company company1 = Company.CSC;
		System.out.println(company1);

		City city1 = City.INDORE;
		System.out.println(city1);

		/*
		 * enum Country { //Cant declare enum inside method INDIA, PAK; }
		 */
	}

}
