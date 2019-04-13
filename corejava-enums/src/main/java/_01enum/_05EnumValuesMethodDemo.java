package _01enum;

enum Weeks {

	MONDAY, TUESDAY, SUNDAY;    // public static final Weeks Monday = new Weeks(),
								// public static final Weeks Tuesday = new Weeks(),
								// public static final Weeks Sunday = new Weeks();

}

public class _05EnumValuesMethodDemo {

	public static void main(String[] args) {
		Weeks[] weeks = Weeks.values();

		for (Weeks week : weeks) {
			System.out.println(week + " " + week.ordinal());
		}
	}

}
