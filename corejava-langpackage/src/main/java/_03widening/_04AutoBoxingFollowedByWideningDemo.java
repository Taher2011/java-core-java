package _03widening;

public class _04AutoBoxingFollowedByWideningDemo {

	public static void m1(Object O) {
		System.out.println("Object version");
	}
	
	public static void m1(Integer I) {
		System.out.println("Integer version(AutoBoxing)");
	}
	
	public static void m1(long l) {
		System.out.println("primitive version(Widening)");
	}
	
	public static void main(String[] args) {
		int i = 10;
		m1(i);
	}

}
