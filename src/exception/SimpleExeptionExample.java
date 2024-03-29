package exception;

public class SimpleExeptionExample {
	
	public static void div(int a, int b) {
		
		int c=a/b;
		
		System.out.println(c);
		
	}
	
	public static void mul(int a, int b) {
		
		int c=a*b;
		
		System.out.println(c);
		
	}
	
	public static void main(String[] args) {
		
		div(10,0);
		
		mul(10,10);
		
				
				
	}

}
