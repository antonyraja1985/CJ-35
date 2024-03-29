package methodtypes;

public class MethodWithReturnTypeTestCase2 {
	
   
	
	public byte byteExample(byte a, byte b) {
		
	
		byte c=(byte) (a+b);
		
		return c;
	}
	
	
	
	public static void main(String[] args) {
		
		MethodWithReturnTypeTestCase2 mr=new MethodWithReturnTypeTestCase2();

		byte a=10;
		byte x = mr.byteExample(a, a);
	}
	
	

}
