package abstraction;

public class Antony extends InfoSys{

public void employeeDetails() {
		
		String employeeName="Antony";
				
		int employeeAge=36;
		
		String employeeDesignation="JSD";
		
		System.out.println(employeeName+" :"+employeeAge+" :"+employeeDesignation);
		
		
	}


public void employeeSalary() {
	// TODO Auto-generated method stub
	System.out.println("40000");
}
	
	
	public static void main(String[] args) {
		
		Antony a=new Antony();
		a.companyName();
		a.employeeDetails();
		a.employeeSalary();
	}


	
	
}
