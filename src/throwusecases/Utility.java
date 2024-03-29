package throwusecases;

public class Utility {
	
	public void add (int a, int b) throws InvalidInputException{
		
		if(a==10) {
			throw new InvalidInputException();
		}
		
		int c=a+b;
		System.out.println(c);
	
	}
	
	public void changeUppercase(String name) {
		
		System.out.println(name.toUpperCase());
	}

}
