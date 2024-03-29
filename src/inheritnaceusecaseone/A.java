package inheritnaceusecaseone;

public class A {
	
	int age;
	
	A(){
		System.out.println("A constructor called");
	}
	
	A(int age){
		
		this.age=age;
		
		System.out.println("A parameter constructor called");
	}
	
	
	public void m1() {
		
		System.out.println("I am m1() Belongs to A");
	}

}
