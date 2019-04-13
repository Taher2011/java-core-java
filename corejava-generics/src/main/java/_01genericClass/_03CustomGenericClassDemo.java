package _01genericClass;

/* To overcome TypeSafety and TypeCasting issues
 * Sun provide Generics concept.
 * */

class Employee {

	private int empId;

	public Employee(int empId) {
		super();
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "" + empId;
	}

}

class CustomGeneric<T> {

	private T obj;

	public CustomGeneric(T obj) {
		this.obj = obj;
	}

	public void showClassName() {
		System.out.println("type of obj is " + obj.getClass().getName());
	}

	public T getObj() {
		return obj;
	}
}

public class _03CustomGenericClassDemo {

	public static void main(String[] args) {
		CustomGeneric<String> strObj = new CustomGeneric<String>("A");
		strObj.showClassName();
		System.out.println(strObj.getObj());

		System.out.println();

		CustomGeneric<Integer> intObj = new CustomGeneric<Integer>(1);
		intObj.showClassName();
		System.out.println(intObj.getObj());

		System.out.println();

		CustomGeneric<Employee> empObj = new CustomGeneric<Employee>(new Employee(123));
		empObj.showClassName();
		System.out.println(empObj.getObj());
	}

}
