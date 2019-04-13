package _11instanceControlFlow;

//Point 1, Execution of static control flow will be executed

// Point 2, Identification of instance member from Parent to Child

// Point 3, Execution of instance variable assignments and execution of
// instance blocks only in Parent

// Point 4, Execution of Parent Constructors 

// Point 5, Execution of instance variable assignments and execution of
//instance blocks in Child

// Point 6, Execution of Child Constructors 

class Parent {

	int i = 10;

	{
		m1();
		System.out.println("Parent Instance block");
	}

	Parent() {
		System.out.println("Parent Constructor");
	}

	public static void main(String[] args) {
		Parent parent = new Parent();
		System.out.println("main");
	}

	public void m1() {
		System.out.println("j is " + j);
	}

	int j = 20;
}

class Child extends Parent {

	int x = 100;

	{
		m2();
		System.out.println("Child First Instance block");
	}

	Child() {
		System.out.println("Child Constructor");
	}

	public static void main(String[] args) {
		Child child = new Child();
		System.out.println("Child main");
	}

	public void m2() {
		System.out.println("y is " + y);
	}

	int y = 20;

	{
		System.out.println("Child Second Instance block");
	}
}

public class _03InstanceBlockFlowParentToChildDemo {

	public static void main(String[] args) {

	}

}
