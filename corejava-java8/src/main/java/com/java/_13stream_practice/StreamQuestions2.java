package com.java._13stream_practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
class Employee {
	private String name;
	private String gender;
	private int age;
	private double salary;
}

public class StreamQuestions2 {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee("John", "Male", 30, 70000),
				new Employee("Emma", "Female", 25, 50000), new Employee("Alex", "Male", 45, 90000),
				new Employee("Sophia", "Female", 33, 85000), new Employee("Mark", "Male", 28, 95000));

		// countofMaleandFemaleEmployee(employees);

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 2, 4, 7, 8, 8, 9, 10, 10, 10, 8);

		// sumofEvenandOddNumbers(numbers);

		// findDuplicateElements(numbers);

		// removeAllOccurrencesofGivenCharacter();

		// findTopThreeHighestPaidEmployees(employees);

		// filterOutNullValuesFromaList();

		// flattenListofListsofIntegersIntoSingleListofIntegers();

		// groupListofStringsByLength();

		// concatenateListofStringsIntoSingleString();

		// findEmployeeWithHighestSalary(employees);

		// partitionListOfIntegersIntoEvenAndOddNumbers(numbers);

		List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date");

		Map<String, Integer> collect = fruits.stream().collect(Collectors.toMap(fruit -> fruit, String::length));
		System.out.println(collect);

	}

	private static void partitionListOfIntegersIntoEvenAndOddNumbers(List<Integer> numbers) {
		Map<String, List<Integer>> map1 = numbers.stream()
				.collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Even" : "Odd"));
		System.out.println("evenNumbers " + map1.get("Even"));
		System.out.println("oddumbers   " + map1.get("Odd"));

		Map<Boolean, List<Integer>> map2 = numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
		System.out.println("evenNumbers " + map2.get(true));
		System.out.println("oddumbers   " + map2.get(false));
	}

	private static void findEmployeeWithHighestSalary(List<Employee> employees) {
		Employee employee1 = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
				.findFirst().get();
		System.out.println(employee1);

		Employee employee2 = employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();
		System.out.println(employee2);

		double maxSalary = employees.stream().mapToDouble(Employee::getSalary).max().getAsDouble();
		System.out.println(maxSalary);
	}

	private static void concatenateListofStringsIntoSingleString() {
		List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date");
		String concatenatedString = fruits.stream().collect(Collectors.joining(","));
		System.out.println(concatenatedString);
	}

	private static void groupListofStringsByLength() {
		List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date");
		Map<Integer, List<String>> collect = fruits.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(collect);
	}

	private static void flattenListofListsofIntegersIntoSingleListofIntegers() {
		List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5),
				Arrays.asList(6, 7, 8, 9));
		List<Integer> flattenedList = listOfLists.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
		System.out.println(flattenedList);
	}

	private static void filterOutNullValuesFromaList() {
		List<String> fruits = Arrays.asList("apple", null, "banana", "cherry", null, "date");
		fruits.stream().filter(Objects::nonNull).collect(Collectors.toList()).forEach(System.out::println);
	}

	private static void findTopThreeHighestPaidEmployees(List<Employee> employees) {
		employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(3)
				.collect(Collectors.toList()).forEach(System.out::println);
	}

	private static void removeAllOccurrencesofGivenCharacter() {
		String input = "Hello World of languages";
		char charToRemove = 'l';
		String result = input.replace(String.valueOf(charToRemove), "");
		System.out.println("Original String: " + input);
		System.out.println("String after removing '" + charToRemove + "': " + result);
	}

	private static void findDuplicateElements(List<Integer> numbers) {
		Map<Integer, Long> collect = numbers.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		collect.entrySet().stream().filter(entry -> entry.getValue() > 1).map(entry -> entry.getKey())
				.collect(Collectors.toList()).forEach(System.out::println);
	}

	private static void sumofEvenandOddNumbers(List<Integer> numbers) {
		Map<String, Integer> map = numbers.stream().collect(
				Collectors.groupingBy(n -> n % 2 == 0 ? "Even" : "Odd", Collectors.summingInt(n -> n.intValue())));

		Integer sumOfEven = map.get("Even");
		Integer sumOfOdd = map.get("Odd");

		System.out.println("Sum of Even number is " + sumOfEven);
		System.out.println("Sum of Odd  number is " + sumOfOdd);
	}

	private static void countofMaleandFemaleEmployee(List<Employee> employees) {
		Map<String, Long> countofMaleandFemaleEmployees = employees.stream()
				.collect(Collectors.groupingBy(e -> e.getGender(), Collectors.counting()));

		countofMaleandFemaleEmployees.entrySet().stream().forEach(entry -> {
			System.out.println("Gender is " + entry.getKey() + " and count is " + entry.getValue());
		});
	}

}
