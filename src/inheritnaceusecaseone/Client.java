package inheritnaceusecaseone;

import debug.DebugExample;

public class Client {
	
	public static void main(String[] args) {
		
	
		B b=new B();
		
		b.m2();
		b.m1();
		
		
		A a=new A();
		
		System.out.println(a.age);
	
		A a1=new A(10);
		System.out.println(a1.age);
	}

}
