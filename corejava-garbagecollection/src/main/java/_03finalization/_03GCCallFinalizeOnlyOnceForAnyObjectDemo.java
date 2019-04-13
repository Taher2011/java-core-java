package _03finalization;

public class _03GCCallFinalizeOnlyOnceForAnyObjectDemo {

	static _03GCCallFinalizeOnlyOnceForAnyObjectDemo outerDemo;
	
	public static void main(String[] args) throws InterruptedException {
		_03GCCallFinalizeOnlyOnceForAnyObjectDemo innerDemo = new _03GCCallFinalizeOnlyOnceForAnyObjectDemo();
		System.out.println("hash code for object is " + innerDemo.hashCode());
		innerDemo = null;
		System.out.println("Calling GC");
		System.gc();
		Thread.sleep(5000);
		System.out.println("hash code for object is " + outerDemo.hashCode());
		outerDemo = null;
		System.out.println("Calling GC again on same object");
		System.gc();
		Thread.sleep(5000);
		System.out.println("End of main method");
	}

	public void finalize() throws Throwable {
		System.out.println("Finalize method called");
		outerDemo = this;
	}
}
