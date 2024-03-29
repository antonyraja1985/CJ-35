package stringbuilder;

public class StringBuilderExample {
	
	
	public static void main(String[] args) {
		
		StringBuilder builder=new StringBuilder();
		
		builder.append("Hello");
		builder.append(", ");
		builder.append("welcome");
		
		System.out.println(builder);
		System.out.println(builder.hashCode());
	}

}
