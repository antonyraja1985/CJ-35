package composition;

public class Calculator {
	
	public static void main(String[] args) {
		
		ArithmaticOperation ao=new ArithmaticOperation();
		ao.add();
		
		LoaNProcess l=new LoaNProcess();
		
		l.intrestCalculation();
		
		
		
		
	}

}
