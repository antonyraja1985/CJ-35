package encapsulation;

public class Student {
	
	private int id;
	private String studentName;
	private String department;
	private long phoneNo;

	Student(){
		System.out.println("Student dafault constructor");
	}

	public Student(int id, String studentName, String department, long phoneNo) {
		
		this.id = id;
		this.studentName = studentName;
		this.department = department;
		this.phoneNo = phoneNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
	  this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentNames) {
		this.studentName = studentName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
	public void demo() {
		
		System.out.println("demo ");
	}
	
	
	
}
