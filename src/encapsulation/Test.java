package encapsulation;

public class Test {
	
	public static void main(String[] args) {
		
    Employee employee=new Employee(25, "janani");
    
   int empId1  =employee.getEmployeeId();
	
	String empName1 = employee.getEmployeeName();
	
	System.out.println(empId1);
	System.out.println(empName1);
		
    employee.setEmployeeId(50);
    employee.setEmployeeName("antony");
    
	int empId  =employee.getEmployeeId();
	
	String empName = employee.getEmployeeName();
	
	System.out.println(empId);
	System.out.println(empName);
	
	}
		

}
