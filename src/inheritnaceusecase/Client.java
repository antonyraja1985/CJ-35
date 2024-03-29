package inheritnaceusecase;

import debug.DebugExample;

public class Client {
	
	public static void main(String[] args) {
		
		
		C c=new C();
		c.m3();
		c.m2();
		c.m1();
		
		B b=new B();
		
		b.m2();
		b.m1();
		
		A a=new A();
	   a.m1();
		
	}

}
