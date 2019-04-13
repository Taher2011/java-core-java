package _03finalization;

class Employee {

	public void finalize() throws Throwable {
		System.out.println("Finalize method called on employee object");
	}
}

public class _01FinalizeDemo {

	public static void main(String[] args) throws InterruptedException {
		Employee employee = new Employee();
		employee = null;
		System.out.println("Calling GC");
		System.gc();// When GC call finalize(), implicitly finalize() method will be called only once on that object and object would be destroyed
		Thread.sleep(100);
		System.out.println("End of main method");
	}
}
