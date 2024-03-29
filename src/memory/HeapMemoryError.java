package memory;

public class HeapMemoryError {
	
	public static void main(String[] args) {
		int i=0;
		while(true) {
			System.out.println("object creating :"+i);
			HeapMemoryError error=new HeapMemoryError();
			i++;
		}
	}

}
