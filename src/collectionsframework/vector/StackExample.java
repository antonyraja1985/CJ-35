package collectionsframework.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackExample {
	
	public static void main(String[] args) {
		
		Stack<String> s=new Stack();
		
		s.push("Java");
		s.push("html");
		s.push("css");
		System.out.println(s);
		System.out.println(s.peek());	
		System.out.println(s.pop());
		System.out.println(s);
		
 ListIterator<String> it = s.listIterator();
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
		
	}

}
