package collectionsframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIetratorListIterator {
	
	public static void main(String[] args) {
		

		
		ArrayList listCourses=new ArrayList();
		listCourses.add("Java");
		listCourses.add("css");
		listCourses.add("Html");
		listCourses.add("Angular");
		listCourses.add("js");
		listCourses.add("python");
		System.out.println(listCourses.get(0));
		System.out.println(listCourses);
		
		//approach-1
		
		System.out.println("=============fetch data-Iterator====================");
		Iterator it = listCourses.iterator();
	
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		//approach-2
		System.out.println("=============fetch data-forLoop====================");
		
		int size=listCourses.size();
		System.out.println(size);
		
		for(int i=0;i<size;i++) {
			System.out.println(listCourses.get(i));
		}
		//approach-3
     System.out.println("=============fetch data-forEach====================");
		
		for(Object course:listCourses) {
			
			System.out.println(course);
		}
		
		//approach-4
		
		 System.out.println("=============fetch data-ListIteraor -forward====================");
			
	     ListIterator listIt = listCourses.listIterator();
	     //forward
	     while(listIt.hasNext()) {
	    	 System.out.println(listIt.next());
	     }
	     System.out.println("=============fetch data-ListIteraor -backward ====================");
	     
	     //backward
		while(listIt.hasPrevious()) {
			
			System.out.println(listIt.previous());
		}
	}

}
