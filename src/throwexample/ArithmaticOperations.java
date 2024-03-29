package throwexample;

public class ArithmaticOperations {
	
	public void add(int a, int b) throws JananiException{
		
		
		
		if(10==a) {
			throw new JananiException();	
		}else {
			int c= a+b;
			System.out.println(c);
		}
		
		
		
		
	}
	
	public void demo(String n) throws  NullPointerException{
		
	String name=n;
	
	System.out.println(name.toUpperCase());
	
	
	}

}
