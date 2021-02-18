package com.java._12streams;

import java.util.ArrayList;
import java.util.List;

public class _16WithoutConsumer {

	static List<DomainCompany> domainCompanies = new ArrayList<>();

	public static void main(String[] args) {

		List<DatabaseCompany> databaseCompanies = new ArrayList<>();
		databaseCompanies.add(new DatabaseCompany("TCS", "Pune", "1234"));
		databaseCompanies.add(new DatabaseCompany("CSC", "Indore", "5678"));
		databaseCompanies.add(new DatabaseCompany("LnT", "Nagpur", "9012"));
		System.out.println("Database " + databaseCompanies);

		mapDBCompanyToDomainCompanyObj(databaseCompanies);
		System.out.println("Domain " + domainCompanies);
	}

	public static void mapDBCompanyToDomainCompanyObj(List<DatabaseCompany> databaseCompanies) {
		for (DatabaseCompany databaseCompany : databaseCompanies) {
			DomainCompany domainCompany = new DomainCompany();
			domainCompany.setCompanyCode(databaseCompany.getCompanyCode());
			domainCompany.setCompanyLocation(databaseCompany.getCompanyLocation());
			domainCompany.setCompanyName(databaseCompany.getCompanyName());
			domainCompanies.add(domainCompany);
		}
	}

}
