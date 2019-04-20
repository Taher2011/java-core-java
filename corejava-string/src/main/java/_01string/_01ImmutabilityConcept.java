package _01string;

/*  Once we create an String object we can't perform any changes
 *  in the existing object.If we are trying to perform 
 *  any change with those changes a new object will be created.
 *  This non changeable behavior is called Immutability*/

/*  Once we create an StringBuffer object we can perform any changes
 *  in the existing object.This non changeable behavior is called 
 *  Mutability*/

public class _01ImmutabilityConcept {

	public static void main(String[] args) {
		String s = new String("Ali");//new object will be created in heap and one in SCP, but s will be referred in heap
		s.concat("1");//new constant "1" object will be in SCP, and "Ali1" object will be created in heap because of runtime operation i.e concat()
		System.out.println(s);

		StringBuffer sb = new StringBuffer("Ali");
		sb.append("1");
		System.out.println(sb);
		
		String s1 = new String("Spring"); //new object will be created in heap and one in SCP, but s1 will be referred in heap
		s1.concat("Summer"); //new constant "Summer" object will be in SCP, and "SpringSummer" object will be created in heap because of runtime operation i.e concat()
		String s2 = s1.concat("Winter"); //new constant "Winter" object will be in SCP, and "SpringWinter" object will be created in heap because of runtime operation i.e concat()
		s1 = s1.concat("fall"); //new constant "fall" object will be in SCP, and  "Springfall" object will be created in heap because of runtime operation i.e concat() and now will be referred by s1
		System.out.println(s1);
		System.out.println(s2);
	}

}
