package com.java._03predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Company {

	private String name;
	private double trunover;

	public Company(String name, double trunover) {
		this.name = name;
		this.trunover = trunover;
	}

}

public class _06PredicateAnd {

	public static void main(String[] args) {
		List<Company> companies = new ArrayList<Company>();
		companies.add(new Company("Accenture", 30020));
		companies.add(new Company("Capgemini", 11000));
		companies.add(new Company("CSC", 2000));
		companies.add(new Company("TCS", 31200));

		Predicate<Company> p1 = c -> c.getName().startsWith("T");
		Predicate<Company> p2 = c -> c.getTrunover() > 3200;
		System.out.println("Company Name start with T and Turnover is greater than 3200 are ");
		for (Company company : companies) {
			if (p1.and(p2).test(company))
				System.out.println(company.getName() + " " + company.getTrunover());
		}

	}
}
