package _01waysToMakeObjectEligibleForGC;

public class _02ReassigningReferenceVariableDemo {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		// At this line no objects are eligible for GC

		s1 = new Student();
		// At this line one object(new Student() at line 6) is eligible for GC
		// as now we are pointing reference variable s1 to the newly created
		// object(new Student() at line 10).

		s2 = s1;
		// At this line two objects(new Student() at line 6 and new Student() at
		// line 7) are eligible for GC as now we are pointing reference variable
		// s2 to the s1.
	}
}
