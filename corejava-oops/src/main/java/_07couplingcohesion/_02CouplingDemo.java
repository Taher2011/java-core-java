package _07couplingcohesion;

//The degree of dependency between components are said to be coupling

class A {
	static int i = B.j;
}

class B {
	static int j = C.k;
}

class C {
	static int k = D.m1();
}

class D {
	public static int m1() {
		return 10;
	}
}

// The above components are said to be tightly coupled because A depends on B, B
// depends on C, C depends on D
// Disadvantage of tightly coupled is
// 1)Enhancement will be difficult
// 2)It Suppresses Reusability
// 3)It reduces maintainability

public class _02CouplingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
