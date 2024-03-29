package throwsexample;

public class Calculator {
	
	public static void main(String[] args) {
		
		ArithmaticOperations a=new ArithmaticOperations();
		
		
			try {
				a.div(10, 2);
			} catch (ArithmeticException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (NullPointerException e) {
				// TODO: handle exception
				e.printStackTrace();
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		
	}

}
