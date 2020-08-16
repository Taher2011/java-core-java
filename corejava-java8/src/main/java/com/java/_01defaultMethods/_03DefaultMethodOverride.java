package com.java._01defaultMethods;

interface C {

	String getName(String name);
	
	default String getCompany() {
		return "Company is TCS";
	}
}

class C1 implements C {

	@Override
	public String getName(String name) {
		return null;
	}
	
}

class C2 implements C {
	
	public String getCompany() {
		return "Company is CSC";
	}

	@Override
	public String getName(String name) {
		return null;
	}
}

public class _03DefaultMethodOverride {

	public static void main(String[] args) {
		C1 c1 = new C1();
		System.out.println(c1.getCompany());
		
		C2 c2 = new C2();
		System.out.println(c2.getCompany());
	}

}
