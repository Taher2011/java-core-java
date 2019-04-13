package _07couplingcohesion;

//For every components a clear well defined functionality is required is said to be highly cohesive

class E {

	public void calculate() {
		int a = 10;
		int b = 12;
		int c = 14;
		int d = 16;

		int e = a + b;

		int f = c - d;

		int g = a * e;

		int h = f / d;

	}
}

// The above components is said to be low cohesive because single component is
// responsible for add subtract multiply division

class F {

	public void add() {
		int a = 10 + 8;
	}

	public void subtract() {
		int a = 10 - 8;
	}

	public void multiply() {
		int a = 10 * 8;
	}

	public void division() {
		int a = 10 / 8;
	}
}

// Advantage of higly cohesive is
// 1)Enhancement becomes easy
// 2)It promotes Reusability
// 3)It improves maintainability

public class _01CohesionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
