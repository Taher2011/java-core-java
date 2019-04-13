package _06polymorphism;

class ParentOL {

	public void abs(float i) {
		System.out.println("Parent");
	}

	public void abs(ParentOL p) {
		System.out.println("Parent");
	}
}

class ChildOL extends ParentOL {

	public void abs(int i) {
		System.out.println("Child");
	}

	public void abs(ChildOL c) {
		System.out.println("Child");
	}
}

public class _01OverloadingPolymorphismDemo {

	public static void main(String[] args) {
		ParentOL p = new ParentOL();
		ChildOL c = new ChildOL();
		ParentOL pc = new ChildOL();
		
		p.abs(10.2f);
		p.abs(10);
		p.abs(p);
		
		System.out.println();
		
		c.abs(10);
		c.abs(10l);
		c.abs(p);
		c.abs(c);
		
		System.out.println();
		
		pc.abs(10);
		pc.abs(p);
		pc.abs(c);
	}

}
