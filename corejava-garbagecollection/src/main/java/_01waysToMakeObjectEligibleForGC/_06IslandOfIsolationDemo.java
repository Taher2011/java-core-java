package _01waysToMakeObjectEligibleForGC;

public class _06IslandOfIsolationDemo {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		// At this line no objects are eligible for GC
		
		s1.s = s2;
		s2.s = s3;
		s3.s = s1;
		// At this line no objects are eligible for GC
		
		s1 = null;
		s2 = null;
		s3 = null;
		// At this line all 3 objects are eligible for GC
				
	}
}
