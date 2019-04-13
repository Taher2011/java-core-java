package _03widening;

public class _03AutoBoxingVsVarArgMethodDemo {

	public static void m1(Integer I) {
		System.out.println("AutoBoxing");
	}

	public static void m1(int... i) {
		System.out.println("VarArgMethod");
	}
	
	public static void main(String[] args) {
		int i = 10;
		m1(i);
		System.out.println("AutoBoxing dominates VarArgMethod as VarArgMethod gets the least priority");
	}

}
