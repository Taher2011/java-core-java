package _01waysToMakeObjectEligibleForGC;

public class _01NullifyingReferenceVariableDemo {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		// At this line no objects are eligible for GC
		
		s1 = null;
		// At this line one(s1) object is eligible for GC
		
		s2 = null;
		// At this line two objects(s1 and s2) are eligible for GC
	}
}
