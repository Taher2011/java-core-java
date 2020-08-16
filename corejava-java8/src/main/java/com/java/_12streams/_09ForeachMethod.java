package com.java._12streams;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
class Company {

	private String name;

	public Company(String name) {
		this.name = name;
	}

}

public class _09ForeachMethod {

	public static void main(String[] args) {
		List<Company> companies = new ArrayList<>();
		companies.add(new Company("Accenture"));
		companies.add(new Company("CG"));
		companies.add(new Company("TCS"));
		companies.add(new Company("CSC"));
		companies.add(new Company("GL"));

		for (Company company : companies) {
			System.out.println("Company Name is " + company.getName());
		}

		System.out.println();
		
		// using stream concept
		companies.stream().forEach(company -> System.out.println("Company Name is " + company.getName()));
	}

}
