package _01string;

public class _03StringConstantPoolConceptInString {

	public static void main(String[] args) {

		String s = new String("Ali"); // In this case 2 objects will be created one in heap and other is SCP and 's'
										// is always point to heap object

		String s1 = "Ali"; // In this case only one object will be created in SCP and 's' is always point
							// to that object

		System.out.println("s  " + s);
		System.out.println("s1 " + s1);

	}

}
