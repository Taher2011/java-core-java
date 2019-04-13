package _02immutableclass;

class Employee {
	private int id;
	private String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee employeeMutable(Employee employee) {
		employee.id = 789;
		employee.name = "GHI";
		return employee;
	}

	public String toString() {
		return id + " " + name;
	}
}

public class _01MutableClassCreationDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee(123, "ABC");
		Employee e2 = new Employee(456, "DEF");
		
		System.out.println(e1);
		System.out.println(e2);
		
		e1.employeeMutable(e2);

		System.out.println(e1);
		System.out.println(e2);
	}

}
