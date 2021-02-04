package _01string;

public class _04RunTimeOperationConcept {

	public static void main(String[] args) {

		String s1 = new String("ali"); // new object will be created in heap and one in SCP, but s will be referred in
										// heap

		String s2 = s1.toUpperCase(); // Because of run time operation , if there is change in content and with those
										// changes new object will get created on the heap. "ALI" string object will get
										// created in heap for s2 reference variable.

		String s3 = s1.toLowerCase(); // Because of run time operation , if there is no change in content then
										// existing object will be reused and new object won't be created. s3 reference
										// variable pointing to s1.

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);

		String s4 = s2.toLowerCase(); // Because of run time operation , if there is change in content and with those
										// changes new object will get created on the heap. "ali" string object will get
										// in heap for s4 reference variable.
		System.out.println(s1 == s4);

		String s5 = s2.toUpperCase(); // Because of run time operation , if there is no change in content then
										// existing object will be reused and new object won't be created. s5 reference
										// variable pointing to s2.
		System.out.println(s2 == s5);

	}

}
