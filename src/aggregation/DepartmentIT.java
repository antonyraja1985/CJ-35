package aggregation;

public class DepartmentIT {
	
	String departmentName;
	Employee employee;
	
	DepartmentIT(String departmentName,Employee employee){
		
		this.departmentName=departmentName;
		this.employee=employee;
	}
	
	public static void main(String[] args) {
		
		Employee employee=new Employee();
		
		employee.setEmployeeId(100);
		employee.setEmployeeName("janani");
		
		DepartmentIT it=new DepartmentIT("it", employee);
		
		
	}

}
