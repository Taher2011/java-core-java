package _15comparatorInterface;

import java.util.Comparator;
import java.util.TreeSet;

/* If we are having sorting requirement for more than one variable,
 * then we can use comparator. 
 * studId for Student object will be sorted according natural sorting order
 * and studName and studMarks for Student object will be sorted according natural sorting order
 * using comparator.
 */
class Student implements Comparable<Student> {
	private int studId;
	private String stuName;
	private float stuMark;

	public Student(int studId, String stuName, float stuMark) {
		super();
		this.studId = studId;
		this.stuName = stuName;
		this.stuMark = stuMark;
	}

	public int getStudId() {
		return studId;
	}

	public String getStuName() {
		return stuName;
	}

	public float getStuMark() {
		return stuMark;
	}

	public int compareTo(Student o) {
		if (this.getStudId() > o.getStudId()) {
			return 1;
		} else if (this.getStudId() < o.getStudId()) {
			return -1;
		} else {
			return 0;
		}
	}

	static class StudentNameComparator implements Comparator<Student> {

		public int compare(Student student1, Student student2) {
			return student1.getStuName().compareTo(student2.getStuName());
		}
	}

	static class StudentMarksComparator implements Comparator<Student> {

		public int compare(Student student1, Student student2) {
			if (student1.getStuMark() > student2.getStuMark()) {
				return 1;
			} else if (student1.getStuMark() < student2.getStuMark()) {
				return -1;
			} else {
				return 0;
			}
		}
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", stuName=" + stuName
				+ ", stuMark=" + stuMark + "]";
	}

}

public class _03ComparableAndComparatorDemo {

	public static void main(String[] args) {
		Student student1 = new Student(432, "Samir", 81.2f);
		Student student2 = new Student(124, "Bhuvan", 74.58f);
		Student student3 = new Student(342, "Amit", 74.25f);
		Student student4 = new Student(111, "Yash", 78.99f);
		Student student5 = new Student(256, "Jignesh", 58.32f);

		TreeSet<Student> treeSetId = new TreeSet<Student>(); // This constructor is used for natural sorting order.
		treeSetId.add(student1);
		treeSetId.add(student2);
		treeSetId.add(student3);
		treeSetId.add(student4);
		treeSetId.add(student5);
		System.out.println("Sorting by Id");
		System.out.println(treeSetId.toString());

		System.out.println();

		TreeSet<Student> treeSetName = new TreeSet<Student>(new Student.StudentNameComparator()); // This constructor is used for customized sorting order.
		treeSetName.add(student1);
		treeSetName.add(student2);
		treeSetName.add(student3);
		treeSetName.add(student4);
		treeSetName.add(student5);
		System.out.println("Sorting by Name");
		System.out.println(treeSetName.toString());

		System.out.println();

		TreeSet<Student> treeSetMark = new TreeSet<Student>(new Student.StudentMarksComparator()); // This constructor is used for customized sorting order.
		treeSetMark.add(student1);
		treeSetMark.add(student2);
		treeSetMark.add(student3);
		treeSetMark.add(student4);
		treeSetMark.add(student5);
		System.out.println("Sorting by Marks");
		System.out.println(treeSetMark.toString());
	}

}
