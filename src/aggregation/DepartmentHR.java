package aggregation;

public class DepartmentHR {
	
	String departmentName;
	Employee employee;
	
	DepartmentHR(String departmentName,Employee employee){
		
		this.departmentName=departmentName;
		this.employee=employee;
	}
	
	public static void main(String[] args) {
		
		Employee employee=new Employee();
		
		employee.setEmployeeId(100);
		employee.setEmployeeName("janani");
		
		DepartmentHR hr=new DepartmentHR("HR", employee);
		
		
	}

}
