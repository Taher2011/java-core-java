package _01string;

public class _05RunTimeOperationConcept {

	public static void main(String[] args) {

		String s1 = new String("you cannot change me");
		String s2 = new String("you cannot change me");
		System.out.println("s1==s2  " + (s1 == s2));

		String s3 = "you cannot change me";
		System.out.println("s1==s3  " + (s1 == s3));

		String s4 = "you cannot change me";
		System.out.println("s3==s4  " + (s3 == s4));

		String s5 = "you cannot" + " change me"; // This operation will be performed at compile time only, because both
													// arguments are compile time constants.
		System.out.println("s3==s5  " + (s3 == s5));

		String s6 = "you cannot";

		String s7 = s6 + " change me"; // This operation will be performed at run time only, because one argument is
										// normal variable.
		System.out.println("s3==s7  " + (s3 == s7));

		String s8 = s7.toLowerCase(); // Because of run time operation , if there is no change in content then
										// existing object will be reused and new object won't be created. s8 reference
										// variable pointing to s7.
		System.out.println("s7==s8  " + (s7 == s8));

		final String s9 = "you cannot";

		String s10 = s9 + " change me";// This operation will be performed at compile time only, because both
										// arguments are compile time constants.
		System.out.println("s3==s10 " + (s3 == s10));
	}

}
