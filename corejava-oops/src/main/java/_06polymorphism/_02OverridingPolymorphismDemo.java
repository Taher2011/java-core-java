package _06polymorphism;

class ParentOR {

	public void abs(float i) {
		System.out.println("Parent");
	}

	public ParentOR abs(ParentOR p) {
		System.out.println("Parent");
		return p;
	}
}

class ChildOR extends ParentOR {
	
	public void abs(float i) {
		System.out.println("Child");
	}

	public ParentOR abs(ParentOR c) {
		System.out.println("Child");
		return c;
	}
}

public class _02OverridingPolymorphismDemo {

	public static void main(String[] args) {
		ParentOR p = new ParentOR();
		ChildOR c = new ChildOR();
		ParentOR pc = new ChildOR();
		
		p.abs(10.2f);
		p.abs(p);
		
		System.out.println();
		
		c.abs(10);
		c.abs(p);
		c.abs(c);
		
		System.out.println();
		
		pc.abs(10);
		pc.abs(p);
		pc.abs(c);
	}

}
