package methodtypes;

public class MethodWithparameter {

	//method with parameter
	public void add(int a, int b) {	
	
		int c=a+b;
		System.out.println(c);
	}
	
	public void sub(int a, int b) {	
		
		int c=a-b;
		System.out.println(c);
	}
	
	public void addFractionValue(float a, float b, float c) {
		
		float d=a+b+c;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("Method with parameter example");
		
		MethodWithparameter mp=new MethodWithparameter();
		mp.add(50,20);
		mp.sub(4,5);
		mp.addFractionValue(100.5f, 10.5f, 12.5f);
	}
}
