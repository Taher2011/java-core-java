package _01javaLangObjectClass;

class Employee {
	private int empId;
	private String empName;

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	/*
	 * equals method is used to check equality of 2 objects based on either empId or empName or both(empId and empName)
	 */
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		if ((object != null) && (object instanceof Employee)) {
			Employee employee = (Employee) object;
			if (this.empId == employee.empId) {
				return true;
			}
		} else {
			return false;
		}
		return false;
	}

}

public class _03EqualsMethodDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee(123, "A");
		Employee e2 = new Employee(456, "B");
		Employee e3 = new Employee(123, "A");
		Employee e4 = e1;

		System.out.println(e1.equals(e2)); // If our class doesn't override equals() then Object class equal() will be called, which is meant for reference comparison and answer would be false
		System.out.println(e1.equals(e3)); // If our class doesn't override equals() then Object class equal() will be called, which is meant for reference comparison and answer would be false
		System.out.println(e1.equals(e4)); // If our class doesn't override equals() then Object class equal() will be called, which is meant for reference comparison and answer would be true
		System.out.println(e1.equals("B")); 
		System.out.println(e1.equals(null)); 
	}

}
