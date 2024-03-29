package throwexample;

public class Calculator {

	public static void main(String[] args) {
		
		ArithmaticOperations ao=new ArithmaticOperations();
		
		
		
		try {
			
			ao.add(15, 10);
			System.out.println("hello");
		} catch (JananiException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		try {
			ao.demo(null);
			
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("hello");
	}
}
