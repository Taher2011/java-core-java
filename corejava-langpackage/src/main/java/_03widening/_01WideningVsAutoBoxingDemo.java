package _03widening;

public class _01WideningVsAutoBoxingDemo {

	public static void m1(int i) {
		System.out.println("Widening");
	}

	public static void m1(Integer I) {
		System.out.println("AutoBoxing");
	}

	public static void main(String[] args) {
		int i = 10;
		m1(i);
		System.out
				.println("Widening dominates AutoBoxing as Widening concept came earlier then AutoBoxing");
	}

}
