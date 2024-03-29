package debug;

public class DebugExample {
	
	public void m1() {
		
		System.out.println("m1 method excuted");
	}
	public void m2() {
		
		System.out.println("m2 method excuted");
	}
	public void m3() {
		
		System.out.println("m3 method excuted");
	}
	public void m4() {
		
		System.out.println("m4 method excuted");
	}
	public void m5() {
		
		System.out.println("m5 method excuted");
	}
	
	public static void main(String[] args) {
		
		
		DebugExample debugExample=new DebugExample();
		
		debugExample.m1();
		debugExample.m2();
		debugExample.m3();
		debugExample.m5();
		debugExample.m4();
	}

}
