package _02autoBoxing;

public class _05WrapperClassesAreImmutableDemo {

	public static void main(String[] args) {
		Integer x1 = 10;
		Integer y1 = 10;
		x1++;

		System.out.println("x1 is " + x1);
		System.out.println("y1 is " + y1);
		System.out.println("Case 1 x1==y1 is " + (x1 == y1));
		System.out.println();

		Integer x2 = new Integer(10);
		Integer y2 = 10;
		System.out.println("Case 2 x2==y2 " + (x2 == y2));
		System.out.println();

		Integer x3 = 10;
		Integer y3 = 10;
		System.out.println("Case 3 x3==y3 " + (x3 == y3));
		System.out.println();

		Boolean x4 = false;
		Boolean y4 = false;
		System.out.println("Case 4 x4==y4 " + (x4 == y4));
		System.out.println();
		
		Integer x5 = 1000;
		Integer y5 = 1000;
		System.out.println("Case 5 x5==y5 " + (x5 == y5));
		System.out.println();

	}

}
