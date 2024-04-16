package collectionsframework.vector;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {
	
	public static void main(String[] args) {
		
		Vector<Integer> v=new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		
		Enumeration<Integer> elements = v.elements();
		
		while(elements.hasMoreElements()) {
			System.out.println(elements.nextElement());
		}
		
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		 al.add(10);
		 al.add(20);
		 al.add(30);
		 al.add(40);
		 al.add(50);
		
		Enumeration<Integer> alElements = al.elements();
		
		while(elements.hasMoreElements()) {
			System.out.println(elements.nextElement());
		}
		
		
	}

}
