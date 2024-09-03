package com.java._13stream_practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
class Student {

	private int id;

	private String firstName;

	private String lastName;

	private int age;

	private String gender;

	private String departmantName;

	private int joinedYear;

	private String city;

	private int rank;

}

public class StreamQuestions {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
				new Student(1, "Yalice", "Smith", 20, "Female", "Computer Science", 2022, "New York", 69),
				new Student(2, "Bob", "Johnson", 21, "Male", "Mechanical Engineering", 2021, "Chicago", 75),
				new Student(3, "Annie", "Williams", 22, "Female", "Electrical Engineering", 2020, "San Francisco", 42),
				new Student(4, "George", "Brown", 23, "Male", "Mechanical Engineering", 2019, "New York", 44),
				new Student(5, "Ava", "Davis", 19, "Female", "Computer Science", 2023, "Boston", 53),
				new Student(6, "Tom", "Mathew", 21, "Male", "Mechanical Engineering", 2019, "Washington", 68));

		firstNameStartsWithA(students);
		System.out.println(
				"==============================================================================================");
		groupStudentsByDepartmentNames(students);
		System.out.println(
				"==============================================================================================");
		findTotalCountofStudents(students);
		System.out.println(
				"==============================================================================================");
		findMaxAgeofStudents(students);
		System.out.println(
				"==============================================================================================");
		findAllDepartmentsNames(students);
		System.out.println(
				"==============================================================================================");
		findCountofStudentsinEachDepartment(students);
		System.out.println(
				"==============================================================================================");
		findStudentsAgeLessThan22(students);
		System.out.println(
				"==============================================================================================");
		findStudentsRankBetween60and100(students);
		System.out.println(
				"==============================================================================================");
		findAverageAgeofMaleandFemale(students);
		System.out.println(
				"==============================================================================================");
		findDepartmentwithMaxNumberofStudents(students);
		System.out.println(
				"==============================================================================================");
		findAverageRankinAllDepartments(students);
		System.out.println(
				"==============================================================================================");
		findHighestRankinEachDepartment(students);
		System.out.println(
				"==============================================================================================");
		findStudentsandSortbyRank(students);
		System.out.println(
				"==============================================================================================");
		findStudentWhoHasSecondRank(students);
		System.out.println(
				"==============================================================================================");
		findStudentsStayinginNewYorkandSortbyName(students);
	}

	private static void firstNameStartsWithA(List<Student> students) {
		students.stream().filter(student -> student.getFirstName().startsWith("A")).collect(Collectors.toList())
				.forEach(System.out::println);
	}

	private static void groupStudentsByDepartmentNames(List<Student> students) {
		Map<String, List<Student>> studentsByDepartmentName = students.stream()
				.collect(Collectors.groupingBy(Student::getDepartmantName));
		studentsByDepartmentName.entrySet().stream().forEach(entry -> {
			System.out.println();
			System.out.println("Department : " + entry.getKey());
			entry.getValue().forEach(v -> System.out.println(v));
		});
	}

	private static void findTotalCountofStudents(List<Student> students) {
		Long count = students.stream().count();
		System.out.println("Total Count of Students : " + count);
	}

	private static void findMaxAgeofStudents(List<Student> students) {
		System.out.println(students.stream().mapToInt(student -> student.getAge()).max().getAsInt());

		System.out.println(students.stream().max(Comparator.comparingInt(s -> s.getAge())).get().getAge());

		System.out.println(students.stream().sorted(Comparator.comparingInt(Student::getAge).reversed()).findFirst()
				.get().getAge());
	}

	private static void findAllDepartmentsNames(List<Student> students) {
		students.stream().map(Student::getDepartmantName).collect(Collectors.toList()).forEach(d -> {
			System.out.println("Department names : " + d);
		});
		;
	}

	private static void findCountofStudentsinEachDepartment(List<Student> students) {
		Map<String, Long> countofStudentsinEachDepartment = students.stream()
				.collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting()));
		countofStudentsinEachDepartment.entrySet().stream().forEach(entry -> {
			System.out.println("Student count in dept : " + entry.getKey() + " is " + entry.getValue());
		});
	}

	private static void findStudentsAgeLessThan22(List<Student> students) {
		students.stream().filter(student -> student.getAge() < 22).collect(Collectors.toList())
				.forEach(System.out::println);
	}

	private static void findStudentsRankBetween60and100(List<Student> students) {
		students.stream().filter(student -> student.getRank() > 60 && student.getRank() < 100)
				.collect(Collectors.toList()).forEach(System.out::println);
	}

	private static void findAverageAgeofMaleandFemale(List<Student> students) {
		Map<String, Double> averageAgeofMaleandFemale = students.stream()
				.collect(Collectors.groupingBy(Student::getGender, Collectors.averagingDouble(Student::getAge)));
		averageAgeofMaleandFemale.entrySet().stream().forEach(entry -> {
			System.out.println("Average age of " + entry.getKey() + " is " + entry.getValue());
		});
	}

	private static void findDepartmentwithMaxNumberofStudents(List<Student> students) {
		Map<String, Long> map = students.stream()
				.collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting()));

		Map.Entry<String, Long> student = map.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		System.out.println(
				"Department " + student.getKey() + " has max number of student with count " + student.getValue());
	}

	private static void findAverageRankinAllDepartments(List<Student> students) {
		Map<String, Double> averageRankinAllDepartments = students.stream().collect(
				Collectors.groupingBy(Student::getDepartmantName, Collectors.averagingDouble(Student::getRank)));
		averageRankinAllDepartments.entrySet().stream().forEach(entry -> {
			System.out.println("Average Rank in Department " + entry.getKey() + " is " + entry.getValue());
		});
	}

	private static void findHighestRankinEachDepartment(List<Student> students) {
		Map<String, Optional<Student>> highestRankinEachDepartment = students.stream().collect(Collectors
				.groupingBy(Student::getDepartmantName, Collectors.maxBy(Comparator.comparingInt(Student::getRank))));
		highestRankinEachDepartment.entrySet().stream().forEach(entry -> {
			System.out.println("Highest rank in dept " + entry.getKey() + " is " + entry.getValue().get().getRank());
		});
	}

	private static void findStudentsandSortbyRank(List<Student> students) {
		students.stream().sorted(Comparator.comparingInt(Student::getRank).reversed()).collect(Collectors.toList())
				.forEach(System.out::println);
	}

	private static void findStudentWhoHasSecondRank(List<Student> students) {
		Student student = students.stream().sorted(Comparator.comparingInt(Student::getRank).reversed()).skip(1)
				.findFirst().get();
		System.out.println("Student with second rank is " + student);
	}

	private static void findStudentsStayinginNewYorkandSortbyName(List<Student> students) {
		students.stream().filter(student -> student.getCity().equals("New York"))
				.sorted(Comparator.comparing(Student::getFirstName)).collect(Collectors.toList())
				.forEach(System.out::println);
	}

}
