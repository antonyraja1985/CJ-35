package aggregation;

public class DepartmentAdmin {
	
	String departmentName;
	Employee employee;
	
	DepartmentAdmin(String departmentName,Employee employee){
		
		this.departmentName=departmentName;
		this.employee=employee;
	}
	
	public static void main(String[] args) {
		
		Employee employee=new Employee();
		
		employee.setEmployeeId(100);
		employee.setEmployeeName("janani");
		
		DepartmentAdmin admin=new DepartmentAdmin("admin", employee);
		
		
	}

}
