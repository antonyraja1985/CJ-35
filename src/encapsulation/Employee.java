package encapsulation;

public class Employee {

	private int employeeId;
	private String employeeName;
	
	//using consructor
	Employee(int employeeId, String employeeName){
		
		this.employeeId=employeeId;
		
		this.employeeName=employeeName;
	}
	
	//using seetter
	
	public void setEmployeeId(int employeeId) {
		
		this.employeeId=employeeId;
	}
	
	public int getEmployeeId() {
		
		return employeeId;
	}
	
	
	public void setEmployeeName(String employeeName) {
		
		this.employeeName=employeeName;
	}
	
	
	public String getEmployeeName() {
		
		return employeeName;
	}
	
}
