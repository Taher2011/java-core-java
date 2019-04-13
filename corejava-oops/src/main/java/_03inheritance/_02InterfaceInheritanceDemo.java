package _03inheritance;

interface P1 {
	void m1();
}

interface P2 {
	void m1();
}

interface P3 extends P1, P2 {

}

public class _02InterfaceInheritanceDemo implements P3 {

	public static void main(String[] args) {
		P1 p1 = new _02InterfaceInheritanceDemo();
		P2 p2 = new _02InterfaceInheritanceDemo();
		P3 p3 = new _02InterfaceInheritanceDemo();
		
		_02InterfaceInheritanceDemo p4 = new _02InterfaceInheritanceDemo();

		p1.m1();
		p2.m1();
		p3.m1();
		p4.m1();
	}

	public void m1() {
		System.out.println("m1");
	}

}
