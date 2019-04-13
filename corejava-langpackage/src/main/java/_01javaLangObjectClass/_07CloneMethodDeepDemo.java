package _01javaLangObjectClass;

class Company implements Cloneable {

	private int companyRegisteredNo;
	private String companyBranch;
	private String companyType;
	private Department department;
	
	public Company(int companyRegisteredNo, String companyBranch,
			String companyType, Department department) {
		super();
		this.companyRegisteredNo = companyRegisteredNo;
		this.companyBranch = companyBranch;
		this.companyType = companyType;
		this.department = department;
	}

	public int getCompanyRegisteredNo() {
		return companyRegisteredNo;
	}

	public void setCompanyRegisteredNo(int companyRegisteredNo) {
		this.companyRegisteredNo = companyRegisteredNo;
	}

	public String getCompanyBranch() {
		return companyBranch;
	}

	public void setCompanyBranch(String companyBranch) {
		this.companyBranch = companyBranch;
	}

	public String getCompanyType() {
		return companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Object clone() throws CloneNotSupportedException {
		Department department = new Department(getDepartment().getDepartmentId(), getDepartment().getDepartmentName());
		Company company = new Company(getCompanyRegisteredNo(), getCompanyBranch(), getCompanyType(), department);
		return company;
	}

	@Override
	public String toString() {
		return "CompanyRegisteredNo : " + companyRegisteredNo
				+ ", CompanyBranch : " + companyBranch + ", CompanyType : "
				+ companyType + " " + department;
	}
}

class Department {
	
	private int departmentId;
	private String departmentName;
	
	public Department(int departmentId, String departmentName) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return ", DepartmentId : " + departmentId + ", DepartmentName : " + departmentName;
	}
}

/*
 * Deep cloning is, if main object contains primitive variables the exactly
 * duplicate copies will be created in the cloned object.if main object contains
 * reference variables then corresponding object will be created just duplicate
 * reference variable will be created pointing to an new object.
 */
public class _07CloneMethodDeepDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Department department = new Department(123, "Insurance");
		Company companyOriginal = new Company(456, "JBRoad", "Software", department);
		System.out.println("Original Object--> " + companyOriginal);
		
		Company companyClone = (Company) companyOriginal.clone();
		System.out.println("Cloned   Object--> " + companyClone);
		
		System.out.println();
		
		companyClone.setCompanyType("Pharma  ");
		companyClone.getDepartment().setDepartmentId(321);
		companyClone.getDepartment().setDepartmentName("Finance");
		System.out.println("Original Object--> " + companyOriginal);
		System.out.println("Cloned   Object--> " + companyClone);
	}

}
