package collectionsframework.genrics;

import java.util.ArrayList;

public class ArrayListGenericsExample {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> list=new ArrayList<String> ();
	
		
		list.add("java");		
		System.out.println(list);
		
		ArrayList<Integer> numberList=new ArrayList ();		
		numberList.add(10);
		numberList.add(20);		
		System.out.println(numberList);
		
		//auto boxing		
		int a=10;
		
		Integer obj=a;
		System.out.println(obj);
		
		int x=obj;
		//unboxing		
		System.out.println(x);
		
		
		ArrayList<Float> floatList=new ArrayList ();		
		floatList.add(10.25f);
		floatList.add(20.25f);		
		System.out.println(floatList);
		
		
		ArrayList<Long> LonList=new ArrayList();
		LonList.add(45785L);
		
	Object ob=new Object();
	
	}

}
