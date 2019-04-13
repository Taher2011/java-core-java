package _01javaLangObjectClass;

class Citizen {

	private int aadharNo;

	public Citizen(int aadharNo) {
		super();
		this.aadharNo = aadharNo;
	}

	public int getAadharNo() {
		return aadharNo;
	}

	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if (object instanceof Citizen) {
			Citizen citizen = (Citizen) object;
			if (this.getAadharNo() == citizen.getAadharNo()) {
				return true;
			}
		}
		return false;
	}
}

public class _08EqualOperatorAndEqualMethodContractDemo {

	public static void main(String[] args) {
		Citizen c1 = new Citizen(123);
		Citizen c2 = new Citizen(123);
		Citizen c3 = c1;
		Citizen c4 = new Citizen(456);

		if (c1 == c3) {
			System.out
					.println("If two objects are equals     by == operator, then equals() method is always return true");
		}

		if (!(c1 == c2)) {
			System.out
					.println("If two objects are not equals by == operator, then equals() method may return true or may return false");
		}

		System.out.println();
		
		if (c1.equals(c2)) {
			System.out
					.println("If two objects are equals     by equals() method, then == operator may return true or may return false");
		}

		if (!(c1.equals(c4))) {
			System.out
					.println("If two objects are not equals by equals() method, then == operator is always return false");
		}
	}
}
