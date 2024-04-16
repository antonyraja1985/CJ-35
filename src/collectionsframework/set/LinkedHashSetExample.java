package collectionsframework.set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	
	public static void main(String[] args) {
		
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("java");
		lhs.add("java");
		lhs.add("css");
		lhs.add("html");
		lhs.add("angular");
		lhs.add("spring boot");
		lhs.add(null);
		System.out.println(lhs);
	}

}
