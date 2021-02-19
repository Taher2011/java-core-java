package _04wildcardType;

import java.util.ArrayList;

interface College {

}

class EngineeringCollege implements College {

}

class MedicalCollege implements College {

}

public class _04ArraylistOfYTypeOrItsImplementedClassesDemo {

	/*
	 * We can call this method by passing ArrayList of either Y type or its
	 * implemented classes objects. Within this method we can not add objects
	 * because we don't know the type exactly except null.
	 */
	public static void m1(ArrayList<? extends College> al) {
		System.out.println("ArrayList<? extends College al");
		// al.add(new Student()); //compile time error
		al.add(null);
	}

	public static void main(String[] args) {

		ArrayList<College> colleges = new ArrayList<>();
		m1(colleges);

		ArrayList<EngineeringCollege> engineeringColleges = new ArrayList<>();
		m1(engineeringColleges);

		ArrayList<MedicalCollege> medicalColleges = new ArrayList<>();
		m1(medicalColleges);
	}
}
