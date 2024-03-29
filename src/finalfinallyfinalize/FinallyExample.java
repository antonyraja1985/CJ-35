package finalfinallyfinalize;

public class FinallyExample {
	public static void main(String[] args) {
		
		try {
			int a=10;
			
			int b=10;
			
			int c=a/b;
					
			System.out.println(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			System.out.println("finally block executed");
		}
		
	}

}
