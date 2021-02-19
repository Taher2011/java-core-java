package _04wildcardType;

import java.util.ArrayList;

class Company {

}

class ITCompany extends Company {

}

class AutoCompany extends Company {

}

public class _03ArraylistOfXTypeOrItsChildClassesDemo {

	/*
	 * We can call this method by passing ArrayList of either X type or its child
	 * classes objects. Within this method we can not add objects because we don't
	 * know the type exactly except null.
	 */
	public static void m1(ArrayList<? extends Company> al) {
		System.out.println("ArrayList<? extends Company> al");
		// al.add(new Company()); //compile time error
		al.add(null);
	}

	public static void main(String[] args) {

		ArrayList<Company> companies = new ArrayList<>();
		m1(companies);

		ArrayList<ITCompany> itCompanies = new ArrayList<>();
		m1(itCompanies);

		ArrayList<AutoCompany> autoCompanies = new ArrayList<>();
		m1(autoCompanies);
	}
}
