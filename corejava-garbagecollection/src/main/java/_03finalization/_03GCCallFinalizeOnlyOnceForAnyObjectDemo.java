package _03finalization;

class Animal {

	public void finalize() {
		System.out.println(this.hashCode());
		_03GCCallFinalizeOnlyOnceForAnyObjectDemo.globalAnimal = this;
		System.out.println("finalize() called");
	}

}

public class _03GCCallFinalizeOnlyOnceForAnyObjectDemo {

	static Animal globalAnimal;

	public static void main(String[] args) throws InterruptedException {

		Animal localAnimal = new Animal();
		System.out.println("hash code for object is " + localAnimal.hashCode());
		
		localAnimal = null;
		System.out.println("Calling GC");
		System.gc();
		
		Thread.sleep(5000);
		
		System.out.println("hash code for object is " + globalAnimal.hashCode());
		
		globalAnimal = null;
		System.out.println("Calling GC again on same object");
		System.gc();
		
		Thread.sleep(5000);
		
		System.out.println("End of main method");

	}

}
