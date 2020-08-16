package com.java._01defaultMethods;

interface E1 {

	default String getCompany() {
		return "Company is TCS";
	}
}

interface E2 {

	default String getCompany() {
		return "Company is CSC";
	}
}

class E3 implements E1, E2 {

	@Override
	public String getCompany() {
		return "GL";
	}

}

public class _05DefaultMethodWithMultipleInheritance {

	public static void main(String[] args) {
		E3 e3 = new E3();
		System.out.println(e3.getCompany());

	}

}
