package _03widening;

public class _05AutoBoxingFollowedByWideningDemo {

	public static void m1(Object O) {
		System.out.println("Object version");
	}
	
	public static void m1(Integer I) {
		System.out.println("Integer version(AutoBoxing)");
	}
	
	public static void main(String[] args) {
		int i = 10;
		m1(i);
	}

}
