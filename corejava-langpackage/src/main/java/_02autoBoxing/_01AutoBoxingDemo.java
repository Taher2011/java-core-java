package _02autoBoxing;

public class _01AutoBoxingDemo {

	public static void main(String[] args) {
		int i = 10;
		
		Integer intg = i; // conversion of primitive to wrapper object is called auto-boxing
		
		//Integer intg = Integer.valueOf(i); // Above line no 8 at compile time is replaced internally by compiler similarly to line no 10
	}

}
