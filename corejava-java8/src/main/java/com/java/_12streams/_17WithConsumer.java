package com.java._12streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class _17WithConsumer {

	static List<DomainCompany> domainCompanies = new ArrayList<>();

	public static void main(String[] args) {

		List<DatabaseCompany> databaseCompanies = new ArrayList<>();
		databaseCompanies.add(new DatabaseCompany("TCS", "Pune", "1234"));
		databaseCompanies.add(new DatabaseCompany("CSC", "Indore", "5678"));
		databaseCompanies.add(new DatabaseCompany("LnT", "Nagpur", "9012"));

		System.out.println("Database " + databaseCompanies);

		// ============================================================================================================//
		Consumer<List<DatabaseCompany>> c = (databaseCompaniesC) -> {
			for (DatabaseCompany databaseCompany : databaseCompaniesC) {
				DomainCompany domainCompany = new DomainCompany();
				domainCompany.setCompanyCode(databaseCompany.getCompanyCode());
				domainCompany.setCompanyLocation(databaseCompany.getCompanyLocation());
				domainCompany.setCompanyName(databaseCompany.getCompanyName());
				domainCompanies.add(domainCompany);
			}
		};
		c.accept(databaseCompanies);
		System.out.println("Domain " + domainCompanies);
		// ============================================================================================================//

		domainCompanies = new ArrayList<>();

		// ============================================================================================================//
		databaseCompanies.stream().forEach(databaseCompany -> {
			DomainCompany domainCompany = new DomainCompany();
			domainCompany.setCompanyCode(databaseCompany.getCompanyCode());
			domainCompany.setCompanyLocation(databaseCompany.getCompanyLocation());
			domainCompany.setCompanyName(databaseCompany.getCompanyName());
			domainCompanies.add(domainCompany);
		});
		System.out.println("Domain " + domainCompanies);
		// ============================================================================================================//

	}

}
