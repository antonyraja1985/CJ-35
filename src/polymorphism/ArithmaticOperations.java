package polymorphism;

public class ArithmaticOperations {

	public void add(int a, int b) {

		int c = a + b;

		System.out.println(c);
	}

	public void add(int a, int b, int c) {

		int d = a + b + c;

		System.out.println(d);
	}

	public void sub(int a) {
		
	}
	
    public void sub(int a) {
		
	}
    
    
	public static void main(String[] args) {

		ArithmaticOperations ao = new ArithmaticOperations();
		ao.add(10, 20);
		ao.add(10, 20, 30);

	}

}
