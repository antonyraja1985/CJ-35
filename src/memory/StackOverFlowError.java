package memory;

public class StackOverFlowError {
	
	public void myName() {
		
		System.out.println("Janani");
		
		myName();
	}
	
	public static void main(String[] args) {
		
		StackOverFlowError stackOverFlowError=new StackOverFlowError();
		
		stackOverFlowError.myName();
	}

}
