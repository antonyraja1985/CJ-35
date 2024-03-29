package finallyexample;

public class Utility {
	
	public void div (int a, int b) throws ArithmeticException{
		
		int c=a/b;
		
		System.out.println(c);
	}
	
	public void chaneUppercase(String name) throws NullPointerException {
		
		System.out.println(name.toUpperCase());
	}

}
