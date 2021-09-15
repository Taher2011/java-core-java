package com.java._01defaultMethods;

interface A { 

	String getName(String name);

	default String getCompany() {
		return "Company is GL";
	}
}

class A1 implements A {

	public String getName(String name) {
		return name;
	}
}

public class _01DefaultMethod {

	public static void main(String[] args) {
		A a = new A1();
		System.out.println("Name is " + a.getName("Taher"));
		System.out.println(a.getCompany());
	}

}
