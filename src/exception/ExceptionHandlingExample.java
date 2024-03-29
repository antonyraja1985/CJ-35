package exception;

public class ExceptionHandlingExample {
	
	public static void div(int a, int b) {
		
		int c=a/b;
		
		System.out.println(c);
		
	}
	
	public static void mul(int a, int b) {
		
		int c=a*b;
		
		System.out.println(c);
		
	}
	
	public static void main(String[] args) {
		
		
		
		
	
			
			try {
				div(10,0);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				//System.out.println(e);
			}
			
		
		
		
		mul(10,10);
		
				
				
	}

}
