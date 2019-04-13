package _02autoBoxing;

public class _04AutoUnBoxingExceptionDemo {

	static Integer I1 = 10;
	static Integer I2;
	
	public static void main(String[] args) {
		int i1 = I1; //AutoUnBoxing ,internally equivalent to I1.intValue()
		System.out.println(i1);
		
		int i2 = I2; //AutoUnBoxing ,internally equivalent to I2.intValue(),,,here I2 is null so get NullPointerException below
		System.out.println(i2);
	}

}
