package finalfinallyfinalize;

public class FinalizeExample extends Object {
	
	
	public static void main(String[] args) {
		
		
		FinalizeExample f=new FinalizeExample();		
		f=null;
		
		System.gc();
		
		
		System.out.println("garbage collector");
		
		
	}
	
	public void finalize() {
		System.out.println("destroyed");
	}

}
