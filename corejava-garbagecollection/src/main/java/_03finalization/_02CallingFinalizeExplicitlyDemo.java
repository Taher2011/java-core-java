package _03finalization;

public class _02CallingFinalizeExplicitlyDemo {

	public void finalize() throws Throwable {
		System.out.println("Finalize method called");
	}
	
	public static void main(String[] args) throws Throwable {
		_02CallingFinalizeExplicitlyDemo demo = new _02CallingFinalizeExplicitlyDemo();
		demo.finalize(); // We can call finalize() explicitly but it would be normal method call and object won't be destroyed
		demo.finalize(); // We can call finalize() explicitly but it would be normal method call and object won't be destroyed
		demo = null;
		System.out.println("Calling GC");
		System.gc();// When GC call finalize() implicitly, finalize() method called only once on that object and object would be destroyed
		Thread.sleep(500);
		System.out.println("End of main method");
	}

}
