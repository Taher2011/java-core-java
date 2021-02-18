package com.java._12streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
class DatabaseCompany {

	private String companyName;
	private String companyLocation;
	private String companyCode;

	@Override
	public String toString() {
		return companyName + " " + companyLocation + " " + companyCode;
	}
}

@Setter
@Getter
class DomainCompany {

	private String companyName;
	private String companyLocation;
	private String companyCode;

	@Override
	public String toString() {
		return companyName + " " + companyLocation + " " + companyCode;
	}

}

public class _09ForeachMethod {

	static List<DomainCompany> domainCompaniesFunction = new ArrayList<>();
	static List<DomainCompany> domainCompaniesConsumer = new ArrayList<>();
	static List<DomainCompany> domainCompaniesForEach = new ArrayList<>();

	public static void main(String[] args) {

		List<DatabaseCompany> databaseCompanies = new ArrayList<>();
		databaseCompanies.add(new DatabaseCompany("TCS", "Pune", "1234"));
		databaseCompanies.add(new DatabaseCompany("CSC", "Indore", "5678"));
		databaseCompanies.add(new DatabaseCompany("LnT", "Nagpur", "9012"));

		System.out.println("Database " + databaseCompanies);

		// ============================================================================================================//
		Function<List<DatabaseCompany>, List<DomainCompany>> f = (databaseCompaniesF) -> {
			for (DatabaseCompany databaseCompany : databaseCompaniesF) {
				DomainCompany domainCompany = new DomainCompany();
				domainCompany.setCompanyCode(databaseCompany.getCompanyCode());
				domainCompany.setCompanyLocation(databaseCompany.getCompanyLocation());
				domainCompany.setCompanyName(databaseCompany.getCompanyName());
				domainCompaniesFunction.add(domainCompany);
			}
			return domainCompaniesFunction;
		};
		f.apply(databaseCompanies);
		System.out.println("Domain " + domainCompaniesFunction);
		// ============================================================================================================//

		// ============================================================================================================//
		Consumer<List<DatabaseCompany>> c = (databaseCompaniesC) -> {
			for (DatabaseCompany databaseCompany : databaseCompaniesC) {
				DomainCompany domainCompany = new DomainCompany();
				domainCompany.setCompanyCode(databaseCompany.getCompanyCode());
				domainCompany.setCompanyLocation(databaseCompany.getCompanyLocation());
				domainCompany.setCompanyName(databaseCompany.getCompanyName());
				domainCompaniesConsumer.add(domainCompany);
			}
		};
		c.accept(databaseCompanies);
		System.out.println("Domain " + domainCompaniesConsumer);
		// ============================================================================================================//

		// ============================================================================================================//
		databaseCompanies.stream().forEach(databaseCompany -> {
			DomainCompany domainCompany = new DomainCompany();
			domainCompany.setCompanyCode(databaseCompany.getCompanyCode());
			domainCompany.setCompanyLocation(databaseCompany.getCompanyLocation());
			domainCompany.setCompanyName(databaseCompany.getCompanyName());
			domainCompaniesForEach.add(domainCompany);
		});
		System.out.println("Domain " + domainCompaniesForEach);
		// ============================================================================================================//

	}

	// below can be replaced by Function interface at line 58
	public static List<DomainCompany> mapDBCompanyToDomainCompanyObjF(List<DatabaseCompany> databaseCompaniesF) {
		for (DatabaseCompany databaseCompany : databaseCompaniesF) {
			DomainCompany domainCompany = new DomainCompany();
			domainCompany.setCompanyCode(databaseCompany.getCompanyCode());
			domainCompany.setCompanyLocation(databaseCompany.getCompanyLocation());
			domainCompany.setCompanyName(databaseCompany.getCompanyName());
			domainCompaniesFunction.add(domainCompany);
		}
		return domainCompaniesFunction;
	}

	// below can be replaced by Consumer interface at line 73 and forEach at line 87
	public static void mapDBCompanyToDomainCompanyObjC(List<DatabaseCompany> databaseCompaniesC) {
		for (DatabaseCompany databaseCompany : databaseCompaniesC) {
			DomainCompany domainCompany = new DomainCompany();
			domainCompany.setCompanyCode(databaseCompany.getCompanyCode());
			domainCompany.setCompanyLocation(databaseCompany.getCompanyLocation());
			domainCompany.setCompanyName(databaseCompany.getCompanyName());
			domainCompaniesConsumer.add(domainCompany);
		}
	}

}
