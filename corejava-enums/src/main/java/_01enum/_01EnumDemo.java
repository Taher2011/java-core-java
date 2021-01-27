package _01enum;

enum Week {
	MONDAY, TUESDAY, SUNDAY; // public static final Week MONDAY = new Week(),
								// public static final Week TUESDAY = new Week(),
								// public static final Week SUNDAY = new Week();

	public static void main(String[] args) {
		System.out.println("Main method in enum");
		System.out.println(MONDAY.hashCode());
		System.out.println(TUESDAY.hashCode());
		System.out.println(SUNDAY.hashCode());
	}
}

public class _01EnumDemo {

	public static void main(String[] args) {

	}

}
