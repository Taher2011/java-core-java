package _11instanceControlFlow;

class ExecutionFlow {

	// Point 1, Execution of static control flow will be executed
	// at line 80, public static void main(String[] args)
	// at line 81, _02InstanceControlFlowExecutionDemo demo = new _02InstanceControlFlowExecutionDemo();

	// Point 2, Identification of instance member from top to bottom for 1st object
	// at line 53, int i
	// at line 55, {
	// at line 59, _02InstanceControlFlowExecutionDemo()
	// at line 64, _02InstanceControlFlowExecutionDemo(int i)
	// at line 70, public void m1()
	// at line 74, {
	// at line 78, int i
	
	// Point 3, Execution of instance variable assignments and execution of
	// instance blocks from top to bottom for 1st object
	// at line 53, i = 10
	// at line 56, System.out.println("First Instance block");
	// at line 75, System.out.println("Second Instance block");
	// at line 78, j = 20
	

	// Point 4, Execution of Constructors for 1st object
	// at line 60, System.out.println("i is " + i);
	// at line 61, System.out.println("_02InstanceControlFlowExecutionDemo Constructor");
	
	// Point 2, Identification of instance member from top to bottom for 2nd object
	// at line 53, int i
	// at line 55, {
	// at line 59, _02InstanceControlFlowExecutionDemo()
	// at line 64, _02InstanceControlFlowExecutionDemo(int i)
	// at line 70, public void m1()
	// at line 74, {
	// at line 78, int j
	
	// Point 3, Execution of instance variable assignments and execution of
	// instance blocks from top to bottom for 2nd object
	// at line 53, i = 10
	// at line 56, System.out.println("First Instance block");
	// at line 75, System.out.println("Second Instance block");
	// at line 78, j = 20
	
	// Point 4, Execution of Constructors for 2nd object
	// at line 65, m1();
	// at line 65, System.out.println("j is " + j);
	// at line 67,System.out.println("_02InstanceControlFlowExecutionDemo(int i) Constructor");
	
	// at line 87, System.out.println("main");
}

public class _02InstanceControlFlowExecutionDemo {

	int i = 10;

	{
		System.out.println("First Instance block");
	}

	_02InstanceControlFlowExecutionDemo() {
		System.out.println("i is " + i);
		System.out.println("_02InstanceControlFlowExecutionDemo Constructor");
	}

	_02InstanceControlFlowExecutionDemo(int i) {
		m1();
		System.out
				.println("_02InstanceControlFlowExecutionDemo(int i) Constructor");
	}

	public void m1() {
		System.out.println("j is " + j);
	}

	{
		System.out.println("Second Instance block");
	}

	int j = 20;

	public static void main(String[] args) {
		_02InstanceControlFlowExecutionDemo demo = new _02InstanceControlFlowExecutionDemo();
		_02InstanceControlFlowExecutionDemo demo1 = new _02InstanceControlFlowExecutionDemo(
				2);
		System.out.println("main");
	}

}
