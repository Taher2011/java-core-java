package _02autoBoxing;

public class _02AutoUnBoxingDemo {

	public static void main(String[] args) {
		Integer intg = new Integer(10);
		
		int i = intg; // conversion of wrapper object to primitive is called auto-unboxing
		
		//int i = Integer.intValueOf(); // Above line no 8 at compile time is replaced internally by compiler similarly to line no 10
	}

}
