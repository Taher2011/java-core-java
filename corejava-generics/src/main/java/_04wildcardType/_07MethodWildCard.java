package _04wildcardType;

import java.util.ArrayList;
import java.util.List;

public class _07MethodWildCard {

	public static <E> void print(List<E> list) {
		list.stream().forEach(System.out::println);
	}

	public static void printL(List<?> list) { // same as above method at line 8
		list.stream().forEach(System.out::println);
	}

	public static <E extends Number> void printNumber(List<E> list) {
		list.stream().forEach(System.out::println);
	}

	public static void printNumber1(List<? extends Number> list) { // same as above method at line 16
		list.stream().forEach(System.out::println);
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		print(list);

		List<Integer> listInt = new ArrayList<>();
		listInt.add(1);
		listInt.add(2);
		print(listInt);
	}

}
