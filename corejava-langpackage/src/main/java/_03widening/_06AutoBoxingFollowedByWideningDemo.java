package _03widening;

public class _06AutoBoxingFollowedByWideningDemo {

	public static void m1(Object O) {
		System.out.println("Object version(AutoBoxing followed by Widening)");
	}
	
	public static void main(String[] args) {
		int i = 10;
		m1(i);
	}

}
