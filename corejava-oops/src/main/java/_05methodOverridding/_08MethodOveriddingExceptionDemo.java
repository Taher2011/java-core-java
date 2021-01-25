package _05methodOverridding;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

class Parent7 {

	public void property() throws Exception {
		System.out.println("GoldCashLand");
	}

	public void marriage() {
		System.out.println("Parent7 marriage");
	}

	public void job() throws Exception {
		System.out.println("Parent7 job");
	}

	public void relatives() throws IOException {
		System.out.println("Parent7 relatives");
	}

	public void friends() throws IOException {
		System.out.println("Parent7 friends");
	}

	public void neighbours() throws IOException {
		System.out.println("Parent7 neighbours");
	}

	public void relation() throws IOException {
		System.out.println("Parent7 relation");
	}

}

class Child7 extends Parent7 {

	public void property() {
		System.out.println("GoldCashLand");
	}

//	 Compile time error

//	  public void marriage() throws Exception {
//	   System.out.println("Child7 marriage"); 
//	  }

	public void job() throws IOException {
		System.out.println("Child7 job");
	}

//	Compile time error

//	public void relatives() throws Exception {
//		System.out.println("Parent7 relatives");
//	}

	public void friends() throws FileNotFoundException, EOFException {
		System.out.println("Child7 friends");
	}

//  Compile time error

//	public void neighbours() throws FileNotFoundException, InterruptedException {
//		System.out.println("Parent7 neighbours");
//	}

	public void relation() throws RuntimeException {
		System.out.println("Child7 relation");
	}
}

public class _08MethodOveriddingExceptionDemo {

	public static void main(String[] args) {

		Parent7 p = new Parent7();
		Child7 c = new Child7();
		Parent7 pc = new Child7();

		try {
			p.property();
			p.job();
		} catch (Exception e) {
			e.printStackTrace();
		}

		p.marriage();

		try {
			p.relatives();
			p.friends();
			p.neighbours();
			p.relation();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println();

		c.property();
		c.marriage();
		try {
			c.job();
			c.relatives();
			c.friends();
			c.neighbours();
		} catch (IOException e) {
			e.printStackTrace();
		}
		c.relation();

		System.out.println();

		try {
			pc.property();
		} catch (Exception e) {
			e.printStackTrace();
		}
		pc.marriage();

		try {
			pc.job();
			pc.relatives();
			pc.friends();
			pc.neighbours();
			pc.relation();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
