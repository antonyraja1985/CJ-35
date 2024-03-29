package throwusecases;

public class ThrowUseCaseExample {
	public static void main(String[] args) {
		
		
		Utility u=new Utility();
		
		try {
			u.add(10, 2);
		} catch (InvalidInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			System.out.println("finally block will be executed");
		}
		
	}

}
