package collectionClassUtility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _2CollectionsBinarySearchMethodDemo {

	public static void main(String[] args) {
		List<String> listStr = new ArrayList<String>();
		listStr.add("R");
		listStr.add("Q");
		listStr.add("H");
		listStr.add("C");
		listStr.add("V");
		System.out.println("unsorted listStr " + listStr);
		
		Collections.sort(listStr); // List must be sorted before using binarySearch else will get unpredictable o/p
		System.out.println("sorted listStr   " + listStr);
		System.out.println(Collections.binarySearch(listStr, "R")); ///////////////////////////////////////
		
		System.out.println();
		
		List<Integer> listInt = new ArrayList<Integer>();
		listInt.add(7);
		listInt.add(4);
		listInt.add(8);
		listInt.add(2);
		listInt.add(4);
		System.out.println("unsorted listInt " + listInt);
		Collections.sort(listInt); // List must be sorted before using binarySearch else will get unpredictable o/p
		System.out.println("sorted listInt   " + listInt);
		System.out.println(Collections.binarySearch(listInt, 4)); ///////////////////////////////////////
		
		System.out.println();
		
		Employee e1 = new Employee("E");
		Employee e2 = new Employee("C");
		Employee e3 = new Employee("T");
		Employee e4 = new Employee("X");
		List<Employee> listEmp = new ArrayList<>();
		listEmp.add(e1);
		listEmp.add(e2);
		listEmp.add(e3);
		listEmp.add(e4);
		System.out.println("unsorted Emp list " + listEmp);
		Collections.sort(listEmp, new Employee()); // List must be sorted before using binarySearch else will get unpredictable o/p
		System.out.println("sorted Emp list   " + listEmp);
		System.out.println(Collections.binarySearch(listEmp, new Employee("X"),  new Employee()));
		
	}

}
