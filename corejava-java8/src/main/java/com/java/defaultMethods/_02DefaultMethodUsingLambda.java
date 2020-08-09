package com.java.defaultMethods;

interface B {

	String getName(String name);

	default String getCompany() {
		return "Company is TCS";
	}
}

public class _02DefaultMethodUsingLambda {

	public static void main(String[] args) {
		B b = name -> "Name is " + name;
		System.out.println(b.getName("John"));
		System.out.println(b.getCompany());
	}

}
