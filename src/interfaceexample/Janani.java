package interfaceexample;

public class Janani implements Infosys, InsInsurance {

	@Override
	public void employeeDetails() {
		// TODO Auto-generated method stub

		String employeeName="Janani";
				
		int employeeAge=30;
		
		String employeeDesignation="SSD";
		
		System.out.println(employeeName+" :"+employeeAge+" :"+employeeDesignation);
		
	}

	@Override
	public void emplooyeeSalary() {
		// TODO Auto-generated method stub
		System.out.println("50000");
	}
	
	@Override
	public void apply() {
		// TODO Auto-generated method stub
		System.out.println("applied");
	}

	
	public static void main(String[] args) {
		
		
		Janani j=new Janani();
		
		j.emplooyeeSalary();
		j.employeeDetails();
		j.apply();
		
	
		System.out.println(accNo);
	}

	
}
