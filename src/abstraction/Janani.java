package abstraction;

public class Janani extends InfoSys, InsInfosys {

	Janani(){
		
		super(45123);
		System.out.println("janani constructor cllled");
	}
	
	public void employeeDetails() {
		
		String employeeName="Janani";
				
		int employeeAge=30;
		
		String employeeDesignation="SSD";
		
		System.out.println(employeeName+" :"+employeeAge+" :"+employeeDesignation);
		
		
	}
	
	@Override
	public void employeeSalary() {

   System.out.println("50000");
		
	}
	
	public static void main(String[] args) {
		
		Janani j=new Janani();
		j.companyName();
		j.employeeDetails();
		j.employeeSalary();

		
		System.out.println(j.compnanyCode);


	
	}	
}
