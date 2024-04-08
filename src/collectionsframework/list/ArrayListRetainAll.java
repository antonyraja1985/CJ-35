package collectionsframework.list;

import java.util.ArrayList;

public class ArrayListRetainAll {
	
	public static void main(String[] args) {
		

		
		ArrayList listCourses=new ArrayList();
		listCourses.add("Java");
		listCourses.add("css");
		listCourses.add("Html");
		listCourses.add("Angular");
		
		
		ArrayList listCoursesNew=new ArrayList();
		listCoursesNew.add("Java");
		listCoursesNew.add("css");
		listCoursesNew.add("React");
		listCoursesNew.add("c++");
		listCoursesNew.retainAll(listCourses);
		
		System.out.println(listCoursesNew);
	}

}
