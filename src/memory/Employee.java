package memory;

public class Employee {

	String employerName;
	
	Employee(){
		
		System.out.println("constructor called");
	}

	Employee(String employerName) {

		this.employerName = employerName;
	}

	public void employeeName() {

		String employeeName = "Janani";

		int salary = 45000;
		System.out.println(salary);
	}

	public static void main(String[] args) {

		Employee employeeOne = new Employee();
		System.out.println(employeeOne.employerName);
		Employee employee = new Employee("wipro");
		employee.employeeName();
		System.out.println(employee.employerName);
		
	}
}
