package collectionsframework.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		
		 ArrayList list=new  ArrayList(); //default size is 10
		
		list.add(10);
		list.add(20);
	
		list.add(30);
		list.add(40);
	
		System.out.println(list.get(5));// index based
		System.out.println(list);
		ArrayList listOne=new ArrayList(50);//custom size is 50		
		listOne.add(100);
		System.out.println(listOne);		
		ArrayList listTwo=new ArrayList(list);//size is existing collection
		listTwo.add(200);
		System.out.println(listTwo);
		
		
	}

}
