package com.java._03predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Employer {

	private String name;
	private double trunover;

	public Employer(String name, double trunover) {
		this.name = name;
		this.trunover = trunover;
	}

}

public class _07PredicateOr {

	public static void main(String[] args) {
		List<Employer> employers = new ArrayList<Employer>();
		employers.add(new Employer("Accenture", 320));
		employers.add(new Employer("Capgemini", 11000));
		employers.add(new Employer("CSC", 2000));
		employers.add(new Employer("TCS", 31200));

		Predicate<Employer> p1 = e -> e.getName().startsWith("A");
		Predicate<Employer> p2 = e -> e.getTrunover() > 3200;

		System.out.println("Employer name starts with either 'A' or whose turnover is greater than 3200 are");
		for (Employer employer : employers) {
			if (p1.or(p2).test(employer))
				System.out.println(employer.getName() + " " + employer.getTrunover());
		}

	}
}
