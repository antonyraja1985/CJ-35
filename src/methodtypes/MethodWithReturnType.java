package methodtypes;

public class MethodWithReturnType {
	
	public static int add(int a, int b) {
		
		int c=a+b;	
		
		return c;
	}
	
	public static float addFractionValue(float a, float b) {
		
		float c=a+b;
		
		return c;
	}
	
	public static void main(String[] args) {
		
    int x = add(10,20);
    
    System.out.println(x);
	
	
	float y = addFractionValue(10.25f, 10.25f);
	
	System.out.println(y);
	
		
		
	}

}
