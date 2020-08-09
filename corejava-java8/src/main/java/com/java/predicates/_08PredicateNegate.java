package com.java.predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Department {

	private String name;

	public Department(String name) {
		this.name = name;
	}

}

public class _08PredicateNegate {

	public static void main(String[] args) {
		List<Department> departments = new ArrayList<Department>();
		departments.add(new Department("Mechanical"));
		departments.add(new Department("Electrical"));
		departments.add(new Department("Computers"));
		departments.add(new Department("Civil"));

		Predicate<Department> p1 = d -> d.getName().startsWith("C");

		System.out.println("Department which doesnt start with C are ");
		for (Department department : departments) {
			if (p1.negate().test(department))
				System.out.println(department.getName());
		}

	}
}
