package _01waysToMakeObjectEligibleForGC;

public class _05ObjectsCreatedInsideMethodDemo {

	public static Student m1() {
		Student s1 = new Student();
		Student s2 = new Student();
		// At this line no objects are eligible for GC
		return s1;
	}   // At this line, Once m1() got completed both 's1' and 's2' will be gone, 
		// but we are returning 's1' object but no reference variable of caller method i.e main()
	    // is holding the returned object, so 'new Student()' object at line 6 and 'new Student()' object at line 7 are eligible for GC .


	public static void main(String[] args) {
		m1();
	}
}
