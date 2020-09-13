package com.java._12streams;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
class DBCompany {

	private String companyName;
	private String companyLocation;
	private String companyCode;

}

@Setter
@Getter
@ToString
class DomainCompany {

	private String companyName;
	private String companyLocation;
	private String companyCode;

}

public class _09ForeachMethod {

	public static void main(String[] args) {

		List<DBCompany> dbCompanyList = new ArrayList<>();
		dbCompanyList.add(new DBCompany("TCS", "Pune", "1234"));
		dbCompanyList.add(new DBCompany("CSC", "Indore", "5678"));
		dbCompanyList.add(new DBCompany("GL", "Nagpur", "9012"));

		System.out.println(dbCompanyList);

		List<DomainCompany> domainCompanyList = new ArrayList<>();

		// using stream concept
		dbCompanyList.stream().forEach(db -> {
			DomainCompany domainompany = new DomainCompany();
			domainompany.setCompanyCode(db.getCompanyCode());
			domainompany.setCompanyLocation(db.getCompanyLocation());
			domainompany.setCompanyName(db.getCompanyName());
			domainCompanyList.add(domainompany);
		});

		System.out.println(domainCompanyList);

	}

}
