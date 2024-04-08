package collectionsframework.list;

import java.util.ArrayList;

public class ArrayListRemove {
	
	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		//list.remove(20);
		list.remove(Integer.valueOf(20)); //auto boxing unboxing
		System.out.println(list);
		
		ArrayList listCourses=new ArrayList();
		listCourses.add("Java");
		listCourses.add("css");
		listCourses.add("Html");
		listCourses.add("Angular");
		//listCourses.remove(5);
		listCourses.remove("Angular");
		System.out.println(listCourses);
	
	}

}
