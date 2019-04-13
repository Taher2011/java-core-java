package _09staticControlFlow;

public class _07StaticControlFlowDirectIndirectReadDemo {

	static int x = m1();
	
	static {
		System.out.println(x);
	}
	
	public static int m1() {
		System.out.println("Print");
		System.exit(0);
		return 10;
	}

	public static void main(String[] args) {
		
	}
}
