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
		groupStudentsByDepartmentNames(students);
		findTotalCountofStudents(students);
		findMaxAgeofStudents(students);
		findAllDepartmentsNames(students);
		findCountofStudentsinEachDepartment(students);
		findStudentsAgeLessThan22(students);
		findStudentsRankBetween60and100(students);
		findAverageAgeofMaleandFemale(students);
		findDepartmentwithMaxNumberofStudents(students);
		findAverageRankinAllDepartments(students);
		findHighestRankinEachDepartment(students);
		findStudentsandSortbyRank(students);
		findStudentWhoHasSecondRank(students);
		findStudentsStayinginNewYorkandSortbyName(students);
	}

	private static void firstNameStartsWithA(List<Student> students) {
		students.stream().filter(student -> student.getFirstName().startsWith("A")).forEach(System.out::println);
	}

	private static void groupStudentsByDepartmentNames(List<Student> students) {
		Map<String, List<Student>> studentsByDepartmentNames = students.stream()
				.collect(Collectors.groupingBy(student -> student.getDepartmantName()));

		studentsByDepartmentNames.entrySet().stream().forEach(entry -> {
			System.out.println("Department : " + entry.getKey());
			entry.getValue().stream().forEach(e -> System.out.println(e));
			System.out.println();
		});
	}

	private static void findTotalCountofStudents(List<Student> students) {
		System.out.println(students.stream().count());
	}

	private static void findMaxAgeofStudents(List<Student> students) {
		System.out.println(students.stream().mapToInt(student -> student.getAge()).max().getAsInt());

		System.out.println(students.stream().max(Comparator.comparingInt(s -> s.getAge())).get().getAge());

		System.out.println(students.stream().sorted(Comparator.comparingInt(Student::getAge).reversed()).findFirst()
				.get().getAge());
	}

	private static void findAllDepartmentsNames(List<Student> students) {
		students.stream().map(Student::getDepartmantName).collect(Collectors.toSet()).forEach(System.out::println);
	}

	private static void findCountofStudentsinEachDepartment(List<Student> students) {
		Map<String, Long> countofStudentsinEachDepartment = students.stream()
				.collect(Collectors.groupingBy(student -> student.getDepartmantName(), Collectors.counting()));

		countofStudentsinEachDepartment.entrySet().stream().forEach(entry -> {
			System.out.println("Department : " + entry.getKey() + " and count is " + entry.getValue());
		});
	}

	private static void findStudentsAgeLessThan22(List<Student> students) {
		students.stream().filter(student -> student.getAge() < 22).collect(Collectors.toList())
				.forEach(System.out::println);
	}

	private static void findStudentsRankBetween60and100(List<Student> students) {
		students.stream().filter(student -> student.getRank() > 60 && student.getAge() < 100)
				.collect(Collectors.toList()).forEach(System.out::println);
	}

	private static void findAverageAgeofMaleandFemale(List<Student> students) {
		Map<String, Double> averageAgeofMaleandFemale = students.stream().collect(Collectors
				.groupingBy(student -> student.getGender(), Collectors.averagingDouble(student -> student.getAge())));

		averageAgeofMaleandFemale.entrySet().stream().forEach(entry -> {
			System.out.println("Gender : " + entry.getKey() + " and average age is " + entry.getValue());
		});
	}

	private static void findDepartmentwithMaxNumberofStudents(List<Student> students) {
		Map<String, Long> departmentwithMaxNumberofStudents = students.stream()
				.collect(Collectors.groupingBy(student -> student.getDepartmantName(), Collectors.counting()));
		String department = departmentwithMaxNumberofStudents.entrySet().stream().max(Map.Entry.comparingByValue())
				.get().getKey();
		Long count = departmentwithMaxNumberofStudents.entrySet().stream().max(Map.Entry.comparingByValue()).get()
				.getValue();
		System.out.println(department + " and count is " + count);
	}

	private static void findAverageRankinAllDepartments(List<Student> students) {
		Map<String, Double> averageRankinAllDepartments = students.stream().collect(Collectors.groupingBy(
				student -> student.getDepartmantName(), Collectors.averagingLong(student -> student.getRank())));
		averageRankinAllDepartments.entrySet().stream().forEach(entry -> {
			System.out.println("Department : " + entry.getKey() + " and average rank is " + entry.getValue());
		});
	}

	private static void findHighestRankinEachDepartment(List<Student> students) {
		Map<String, Optional<Student>> highestRankinEachDepartment = students.stream().collect(Collectors.groupingBy(
				student -> student.getDepartmantName(), Collectors.maxBy(Comparator.comparingInt(s -> s.getRank()))));
		highestRankinEachDepartment.entrySet().stream().forEach(entry -> {
			System.out.println(
					"Department : " + entry.getKey() + " and highest rank is " + entry.getValue().get().getRank());
		});
	}

	private static void findStudentsandSortbyRank(List<Student> students) {
		students.stream().sorted(Comparator.comparingInt(s -> s.getRank())).collect(Collectors.toList())
				.forEach(System.out::println);
	}

	private static void findStudentWhoHasSecondRank(List<Student> students) {
		Student student = students.stream().sorted(Comparator.comparingInt(Student::getRank)).skip(1).findFirst().get();
		System.out.println(student);
	}

	private static void findStudentsStayinginNewYorkandSortbyName(List<Student> students) {
		students.stream().filter(student -> student.getCity().equals("New York"))
				.sorted(Comparator.comparing(Student::getFirstName)).collect(Collectors.toList())
				.forEach(System.out::println);
	}

}
