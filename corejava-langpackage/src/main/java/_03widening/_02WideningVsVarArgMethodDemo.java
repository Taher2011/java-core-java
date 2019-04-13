package _03widening;

public class _02WideningVsVarArgMethodDemo {

	public static void m1(int i) {
		System.out.println("Widening");
	}

	public static void m1(int... i) {
		System.out.println("VarArgMethod");
	}
	
	public static void main(String[] args) {
		int i = 10;
		m1(i);
		System.out.println("Widening dominates VarArgMethod as Widening concept came earlier then VarArgMethod");
	}

}
