package constructor;

public class Employee  {

	String employeeAddress = "Chennai"; // global or instance variable
	String employeeName = "Antony";

	public  Employee() {
		System.out.println("constructor called");
	}

	public Employee(String name ) {

		this.employeeName = name;
		System.out.println("==========parameter constructor:" + this.employeeName);
	}
	
	public Employee(String employeeName, String emplyoeeAdress) {
		
		this.employeeName=employeeName;
		this.employeeAddress=emplyoeeAdress;
	}

	public void employeeName() {

		System.out.println("in method: "+this.employeeName);
	}

	public int salary() {

		int salary = 5000;

		return salary;
	}

	public static void main(String[] args) {

		Employee employee = new Employee();
		System.out.println(employee.employeeName);
		System.out.println(employee.employeeAddress);
		Employee employeeOne = new Employee("janani sd");
		System.out.println("===========One ==================");
		System.out.println(employeeOne.employeeName);
		System.out.println(employeeOne.employeeAddress);
		employee.employeeName();
		System.out.println("===========Two==================");
		Employee employeeTwo = new Employee("Tony", "bangalore");
		System.out.println(employeeTwo.employeeName);
		System.out.println(employeeTwo.employeeAddress);
		employee.salary();
		System.out.println("===============Object====================");
		System.out.println(employee.hashCode());
		System.out.println(employeeOne.hashCode());
		System.out.println(employeeTwo.hashCode());		
		System.out.println(employee);
	}

}
