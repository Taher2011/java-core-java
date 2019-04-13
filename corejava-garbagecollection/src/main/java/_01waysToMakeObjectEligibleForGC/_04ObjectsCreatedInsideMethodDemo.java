package _01waysToMakeObjectEligibleForGC;

public class _04ObjectsCreatedInsideMethodDemo {

	public static Student m1() {
		Student s1 = new Student();
		Student s2 = new Student();
		// At this line no objects are eligible for GC
		return s1;
	}   // At this line, Once m1() got completed both 's1' and 's2' will be gone, but we are returning 's1' object and assigning it to 
		// 's' reference variable of caller method i.e main()
		// so 'new Student()' object at line 7 is eligible for GC and 'new Student()' object at line 6 will be referred by 's' reference variable.

	public static void main(String[] args) {
		Student s = m1();
	}
}
