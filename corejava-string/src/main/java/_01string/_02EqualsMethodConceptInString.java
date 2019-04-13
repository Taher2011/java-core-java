package _01string;

/*  In String class equals() is overridden for content comparison 
 *  hence even though objects are different. If content are same 
 *  equals() return true*/

/*  In StringBuffer class equals() is not overridden for content comparison 
 *  hence Object class equal() got executed which is meant for reference
 *  comparison. If objects are different, equals() returns 
 *  false even though content are same*/

public class _02EqualsMethodConceptInString {

	public static void main(String[] args) {
		String s1 = new String("Ali");
		String s2 = new String("Ali");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		StringBuffer sb1 = new StringBuffer("Ali");
		StringBuffer sb2 = new StringBuffer("Ali");
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
	}

}
