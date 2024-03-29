package throwsusecases;

import finallyexample.Utility;

public class ThrowsUsecCases {
	
	public static void main(String[] args) {
		
		Utility u=new  Utility();
		
		try {
			u.div(10, 0);
			u.chaneUppercase(null);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (NullPointerException e) {
			// TODO: handle exception
		}finally {
			
			System.out.println("finally block executed");
		}
		
		
		
		
	}

}
