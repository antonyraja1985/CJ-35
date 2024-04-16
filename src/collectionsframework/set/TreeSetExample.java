package collectionsframework.set;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetExample {
	
	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet();
		ts.add("java");
		ts.add("java");
		ts.add("css");
		ts.add("html");
		ts.add("angular");
		ts.add("spring boot");	
	
		System.out.println(ts);
		
		TreeSet ts1=new TreeSet();
		ts1.add(10);
		ts1.add(60);
		ts1.add(30);
		ts1.add(20);
		ts1.add(40);		
		System.out.println(ts1);
	}

}
