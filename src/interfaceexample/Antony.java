package interfaceexample;

public class Antony implements Infosys, InsInsurance {

	@Override
	public void employeeDetails() {
		// TODO Auto-generated method stub

		String employeeName="Antony";
				
		int employeeAge=30;
		
		String employeeDesignation="SSD";
		
		System.out.println(employeeName+" :"+employeeAge+" :"+employeeDesignation);
		
	}

	@Override
	public void emplooyeeSalary() {
		// TODO Auto-generated method stub
		System.out.println("40000");
	}
	
	@Override
	public void apply() {
		// TODO Auto-generated method stub
		System.out.println("not applied");
	}
	
	public static void main(String[] args) {
		
		Antony a=new Antony();
		
		a.emplooyeeSalary();
		a.employeeDetails();
		a.apply();
		
		System.out.println(accNo);
	}

	

}
