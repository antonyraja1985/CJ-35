package collectionsframework.list;

import java.util.ArrayList;

public class ArrayListMethodsExample {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
        //add()
		list.add(10);// auto boxing
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(10);
		System.out.println(list);
		ArrayList listTwo = new ArrayList();

		
		//addAll()
		listTwo.add(200);
		listTwo.add(600);// auto boxing
		listTwo.add(700);
		listTwo.add(800);
		listTwo.add(900);
		listTwo.add(100);
		listTwo.addAll(list);
		System.out.println(listTwo);
		
//		3.remove(Object c)
		
		//list.remove();
		System.out.println("=========="+list);
//		4.remove(int index)
		list.remove(0);
		System.out.println(list);
		
//		5.get(int index)
		
		System.out.println(list.get(2));
		
//		6.contains(object obj)
		System.out.println(list.contains(60));
		
//		7.clear()
		
		//list.clear();
		System.out.println(list);
//		8.isEmpty()
		System.out.println(list.isEmpty());
//		9.retainAll(Collection c)
		list.retainAll(listTwo);
		System.out.println("----xx-------"+listTwo);
//		10.indexOf(object obj)
		System.out.println(list.indexOf(500));
//		11.lastIndexOf(object obj)
		System.out.println(list.lastIndexOf(10));
//		12.set(int index, Object obj)
		list.set(2, 1000);
		System.out.println(list);
		list.add(2000);
		System.out.println(list);
//		13.iterator()-->forward direction
//		14.listIterator()--forward & backward direction
	}

}
