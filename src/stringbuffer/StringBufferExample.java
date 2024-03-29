package stringbuffer;

public class StringBufferExample {
	
	public static void main(String[] args) {
		
		String s="hello";
		System.out.println(s.hashCode());
		String s1=s+"welcome";
		
		System.out.println("=================Mutable===================");
		System.out.println(s1.hashCode());
		StringBuffer buffer=new StringBuffer();
		
		buffer.append("hello");
		buffer.append(", ");
		buffer.append("World");
		
		
		
		System.out.println(buffer);
		System.out.println(buffer.hashCode());
		
		
	}

}
