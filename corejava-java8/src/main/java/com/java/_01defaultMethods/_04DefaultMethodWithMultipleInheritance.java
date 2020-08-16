package com.java._01defaultMethods;

interface D1 {

	default String getCompany() {
		return "Company is TCS";
	}
}

interface D2 {

	default String getCompany() {
		return "Company is CSC";
	}
}

class D3 implements D1, D2 {

	@Override
	public String getCompany() {
		return D1.super.getCompany();
	}

}

public class _04DefaultMethodWithMultipleInheritance {

	public static void main(String[] args) {
		D3 d3 = new D3();
		System.out.println(d3.getCompany());

	}

}
