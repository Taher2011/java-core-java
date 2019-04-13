package _01javaLangObjectClass;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class _04GetClassMethodDemo {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(new Student("A", 123));
		list.add(new Person(456));
		list.add(new Employee(789, "B"));
		
		for (Object object : list) {
			System.out.println("Fully Qualified Name is " + object.getClass().getName()); // We can use getClass() to get runtime class definition of an object
			Method[] methods = object.getClass().getDeclaredMethods();
			for (Method method : methods) {
				System.out.println("Methods present in " + object.getClass().getName() + " are " + method);
			}
			System.out.println();
		}
	}

}
