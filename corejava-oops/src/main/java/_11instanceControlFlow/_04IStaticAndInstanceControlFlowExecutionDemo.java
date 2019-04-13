package _11instanceControlFlow;

public class _04IStaticAndInstanceControlFlowExecutionDemo {

	{
		System.out.println("First Instance block");
	}

	static {
		System.out.println("First Static block");
	}

	_04IStaticAndInstanceControlFlowExecutionDemo() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		_04IStaticAndInstanceControlFlowExecutionDemo demo1 = new _04IStaticAndInstanceControlFlowExecutionDemo();
		System.out.println("main");
		_04IStaticAndInstanceControlFlowExecutionDemo demo2 = new _04IStaticAndInstanceControlFlowExecutionDemo();
	}

	static {
		System.out.println("Second Static block");
	}

	{
		System.out.println("Second Instance block");
	}

}
