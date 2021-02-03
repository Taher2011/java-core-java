package _01javaLangObjectClass;

class College implements Cloneable {

	private int collegeRegisteredNo;
	private String collegeBranch;
	private String collegeType;
	private Branch branch;

	public College(int collegeRegisteredNo, String collegeBranch, String collegeType, Branch branch) {
		super();
		this.collegeRegisteredNo = collegeRegisteredNo;
		this.collegeBranch = collegeBranch;
		this.collegeType = collegeType;
		this.branch = branch;
	}

	public void setCollegeRegisteredNo(int collegeRegisteredNo) {
		this.collegeRegisteredNo = collegeRegisteredNo;
	}

	public void setCollegeBranch(String collegeBranch) {
		this.collegeBranch = collegeBranch;
	}

	public void setCollegeType(String collegeType) {
		this.collegeType = collegeType;
	}

	public Branch getBranch() {
		return branch;
	}

	/* The process of creating exactly duplicate object is called Cloning */
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "CollegeRegisteredNo : " + collegeRegisteredNo + ", CollegeBranch : " + collegeBranch
				+ ", CollegeType : " + collegeType + " " + branch;
	}
}

class Branch {

	private int branchId;
	private String branchName;

	public Branch(int branchId, String branchName) {
		super();
		this.branchId = branchId;
		this.branchName = branchName;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	@Override
	public String toString() {
		return ", BranchId : " + branchId + ", BranchName : " + branchName;
	}
}

/*
 * Shallow cloning is, if main object contains primitive variables the exactly
 * duplicate copies will be created in the cloned object.if main object contains
 * reference variables then corresponding object won't be created just duplicate
 * reference variable will be created pointing to an old contained object.
 */
public class _06CloneMethodShallowDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Branch branch = new Branch(123, "CS");
		College collegeOriginal = new College(321, "ABRoad", "Engineering", branch);
		System.out.println("Original Object--> " + collegeOriginal);

		College collegeClone = (College) collegeOriginal.clone();
		System.out.println("Cloned   Object--> " + collegeClone);
		System.out.println();

		collegeClone.setCollegeBranch("MGRoad");
		collegeClone.getBranch().setBranchId(456);
		collegeClone.getBranch().setBranchName("EC");
		System.out.println("Original Object--> " + collegeOriginal);
		System.out.println("Cloned   Object--> " + collegeClone);

	}

}
