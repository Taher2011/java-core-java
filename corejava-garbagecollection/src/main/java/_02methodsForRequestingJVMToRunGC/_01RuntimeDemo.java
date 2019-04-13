package _02methodsForRequestingJVMToRunGC;

public class _01RuntimeDemo {

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		System.out.println("Total memory : " + runtime.totalMemory());
		System.out.println("Free  memory : " + runtime.freeMemory());
		System.out.println();
		
		System.out.println("Created lakh employee objects and making lakh objects eligible for GC");
		for (int i = 0; i <= 100000; i++) {
			Employee employee = new Employee();
			employee = null;
		}
		System.out.println("Free memory are after creating lakh objects : " + runtime.freeMemory());
		System.out.println();
		
		System.out.println("Called GC to freed up memory");
		runtime.gc();
		System.out.println();
		
		System.out.println("Free memory are after calling GC : " + runtime.freeMemory());
	}

}
