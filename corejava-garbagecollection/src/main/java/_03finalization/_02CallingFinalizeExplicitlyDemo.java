package _03finalization;

class Person {

	public void finalize() throws Throwable {
		System.out.println("Finalize method called");
	}

}

public class _02CallingFinalizeExplicitlyDemo {

	public static void main(String[] args) throws Throwable {
		Person person = new Person();
		person.finalize(); // We can call finalize() explicitly but it would be normal method call and
							// object won't be destroyed
		person.finalize(); // We can call finalize() explicitly but it would be normal method call and
							// object won't be destroyed
		person = null;
		System.out.println("Calling GC");
		System.gc(); // When GC call finalize() implicitly, finalize() method called only once on
						// that object and object would be destroyed
		Thread.sleep(500);
		System.out.println("End of main method");

	}

}
