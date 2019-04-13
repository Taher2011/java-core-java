package _09staticControlFlow;

//If variable is just identified by JVM and original 
//value not yet assigned then variable is said to be 
//in Read Indirect Write Only state

//If variable is in Read Indirect Write Only state
//we can't perform direct read, but we can perform
//indirect read.

//If we are trying to perform directly then we will
//get Compile time error illegal forward reference
public class _06StaticControlFlowDirectIndirectReadDemo {

	static {
		m1();
	}

	public static void m1() {
		System.out.println(x); // Indirect read
	}
	
	static int x = 10;

	public static void main(String[] args) {

	}

}
