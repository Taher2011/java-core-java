package _01waysToMakeObjectEligibleForGC;

public class _03ObjectsCreatedInsideMethodDemo {

	public static void m1() {
		Student s1 = new Student();
		Student s2 = new Student();
		// At this line no objects are eligible for GC
	}   // At this line, Once m1() got completed both s1 and s2 will be gone, so both objects are eligible for GC.

	public static void main(String[] args) {
		m1();
	}
}
