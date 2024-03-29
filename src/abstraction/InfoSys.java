package abstraction;

public abstract class InfoSys {
	
	static	int  compnanyCode=4523;
	
	
	
	x=20;
	
	InfoSys(){
		
		System.out.println("infosys construtor called");
	}
	
	InfoSys(int compnanyCode){
		
		this.compnanyCode=compnanyCode;
		
		System.out.println("infosys construtor called");
	}
	
	public void companyName() {
		
		System.out.println("Info Sys");
	}
	
	public abstract void employeeDetails();

	public abstract void employeeSalary();
	
	
}
